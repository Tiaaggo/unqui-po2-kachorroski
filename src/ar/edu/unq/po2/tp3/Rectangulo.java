package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Punto esquinaInferiorIzquierda;
	private Punto esquinaSuperiorIzquierda;
	private Punto esquinaInferiorDerecha;
	private Punto esquinaSuperiorDerecha;
	private Integer altura;
	private Integer base;
	
	
	//El rectangulo se crea desde la esquina inferior izquierda
	//la base y la altura siempre deben ser numeros distintos entre si, mayores a 0
	public Rectangulo(Integer puntoX, Integer puntoY, Integer alto, Integer base) {
		
		super();
		
		this.esquinaInferiorIzquierda = new Punto(puntoX, puntoY);
		this.esquinaSuperiorIzquierda = new Punto(puntoX, puntoY + alto);
		this.esquinaSuperiorDerecha = new Punto(puntoX + base, puntoY + alto);
		this.esquinaInferiorDerecha = new Punto(puntoX + base, puntoY);
		this.base = base;
		this.altura = alto;
		
	}
	
	public Integer area() {
		
		Integer area = this.getAltura() * this.getBase();
		
		return area;
		
	}
	
	public Integer perimetro() {
		
		Integer perimetro = (this.getAltura() + this.getBase()) * 2;
		
		return perimetro;
		
	}
	
	public String verticalUHorizontal() {
		
		Integer base = this.getBase();
		Integer altura = this.getAltura();
		
		if(base > altura) {
			
			return "Horizontal";
			
		}
		
		else {
			
			return "Vertical";
			
		}
		
	}

	public Integer getAltura() {
		return altura;
	}

	public Integer getBase() {
		return base;
	}
	
	

}
