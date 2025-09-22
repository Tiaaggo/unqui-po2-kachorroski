package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private Double precio;
	private boolean precioCuidado;
	private Integer descuento;
	
	public Producto(String nombre, Double precio) {
		
		this(nombre, precio, false, 0);		
	}

	public Producto(String nombre, Double precio, Boolean precioCuidado, Integer descuento) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		this.descuento = descuento;
		
	}
	
	public Integer getDescuento() {
		return descuento;
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
