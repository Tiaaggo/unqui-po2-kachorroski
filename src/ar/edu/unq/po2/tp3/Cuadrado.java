package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	private Punto esquinaInferiorIzquierda;
	private Punto esquinaSuperiorIzquierda;
	private Punto esquinaInferiorDerecha;
	private Punto esquinaSuperiorDerecha;
	private Integer altura;
	
	//el cuadrado se crea desde la esquina inferior izquierda
	public Cuadrado(Integer puntoX, Integer puntoY, Integer altura) {
		
		super();
		
		this.esquinaInferiorIzquierda = new Punto(puntoX, puntoY);
		this.esquinaSuperiorIzquierda = new Punto(puntoX, puntoY + altura);
		this.esquinaSuperiorDerecha = new Punto(puntoX + altura, puntoY + altura);
		this.esquinaInferiorDerecha = new Punto(puntoX + altura, puntoY);
		this.altura = altura;
		
	}
	
	public Integer area() {
		
		Integer area = this.getAltura() * this.getAltura();
		
		return area;
		
	}

	public Integer perimetro() {
		
		Integer perimetro = this.getAltura() * 4;
		
		return perimetro;
 		
	}
	
	public Integer getAltura() {
		return altura;
	}

}
