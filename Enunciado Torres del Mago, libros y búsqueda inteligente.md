# Enunciado: Torres del Mago, libros y búsqueda inteligente

Nov 26, 2026 · @Tiago

## Requerimientos

### Torres del Mago y libros

En esta entrega los personajes pueden progresar estudiando, no solo peleando. Se incorporan las **Torres del Mago**, lugares que guardan **libros**, y cada libro enseña un hechizo. El personaje busca libros en la torre donde está, los lee y, con cada lectura, avanza en el hechizo asociado.

El catálogo de libros puede crecer mucho y los jugadores no buscan con palabras exactas: escriben frases como *"algo sobre criaturas que escupen fuego"*. Una consulta SQL de tipo `LIKE` no alcanza para eso, así que el objetivo de esta entrega es resolver la búsqueda con un **motor de búsqueda (Elasticsearch)** apoyado por un **modelo de IA local (Ollama)**, integrado con las bases que ya usa el juego

### Libros y torres

Un **libro** tiene los siguientes datos, todos obligatorios (no pueden ser nulos ni vacíos):

| Campo | Descripción |
| --- | --- |
| Título | Identifica al libro: no puede haber dos libros con el mismo título |
| Descripción | De qué trata el libro |
| Autor | Nombre de quien lo escribió |
| Hechizo | El hechizo que enseña. Un hechizo puede ser enseñado por muchos libros |

Los libros se guardan en **Elasticsearch**, no en PostgreSQL. Además de esos datos, el sistema completa por su cuenta otros dos: las torres donde el libro está disponible y un *vector de significado* generado a partir de su título y descripción.

Una **Torre del Mago** es un lugar más: tiene coordenada y radio, no puede superponerse con otro lugar y se conecta con caminos como cualquier otro. Su biblioteca arranca vacía. Las reglas son:

- Un mismo libro puede estar en varias torres, y una torre puede tener muchos libros.
- No se puede agregar a una torre un libro que ya está en ella.
- Al eliminar un hechizo, se eliminan también todos los libros que lo enseñan.
- Buscar y leer libros solo está permitido en una Torre del Mago.&#32;

### Lectura de libros

Un personaje puede leer un libro solo si se cumplen **todas** estas condiciones:

1. Se encuentra en una Torre del Mago.
2. El libro está en esa torre.
3. No lo leyó antes.
4. No superó su cupo de lecturas: puede haber leído, como máximo, **nivel × 4** libros en total.

### Búsqueda de libros

El personaje busca escribiendo una frase libre, por ejemplo *"algo sobre dragones del mago Gandalf"*. La búsqueda solo se puede hacer desde una Torre del Mago, solo considera los libros de **esa** torre y devuelve los resultados paginados (página y cantidad por página deben ser valores válidos).

La búsqueda se resuelve en estos pasos:

1. **Interpretar la frase.** Un modelo de lenguaje local extrae de ella el `tema` y el `autor`; cualquiera de los dos puede faltar. En el ejemplo, el tema es *dragones* y el autor es *Gandalf*. Si el modelo no devuelve algo interpretable, la frase completa se usa como tema.
2. **Filtrar por torre.** Solo participan los libros disponibles en la torre del personaje.
3. **Filtrar por autor** (si hay). La coincidencia tolera errores de tipeo: *"Merlim"* debe encontrar a *"Merlín"*.
4. **Buscar por tema** (si hay). El tema se convierte en un vector numérico con un modelo de embeddings y se buscan los libros cuyo vector se parezca más, aunque no compartan ninguna palabra con la frase. Los resultados poco parecidos se descartan con un puntaje mínimo.
5. **Sin tema**, solo se aplican los filtros de los pasos 2 y 3.

Para que el paso 4 funcione, al crear cada libro se genera su vector a partir de `título - descripción`, con el **mismo** modelo que se usa al buscar.

## Se pide

### TorreDelMagoService

- `TorreDelMago agregarLibro(Long idTorre, String titulo)`: agrega a la biblioteca de la torre un libro ya existente.

### LugarService

- `Page<LibroElastic> buscarLibros(Long personajeId, String busqueda, Integer pagina, Integer cantLibros)`: busca libros entre los de la torre donde está el personaje.

### PersonajeService

- `Personaje leerLibro(Long personajeId, String titulo)`: el personaje lee el libro si cumple las cuatro condiciones de lectura.

Todos los métodos nuevos deben exponerse en sus controllers REST, respetando las convenciones de los TPs anteriores.
