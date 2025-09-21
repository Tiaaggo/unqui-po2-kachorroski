package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private Double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, Double precio) {
		
		this.nombre = nombre;
		this.precio = precio;		
	}

	public Producto(String nombre, Double precio, Boolean precioCuidado) {
		
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		
	}
	
	public Boolean esPrecioCuidado() {
		
		return this.precioCuidado;
	}
	
	public void aumentarPrecio(Double aumento) {
		
		Double precioActual = this.precio;
		this.precio = precioActual + aumento;
		
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
	
			return precio;
			
	}
	
}
