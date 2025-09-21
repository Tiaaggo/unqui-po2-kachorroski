package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad {
	
	private String nombre;
	private Double precio;
	private boolean precioCuidado;
	
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado) {
		
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado;
		
	}
	
	
	public Double getPrecioCuidado() {
		
		return precio * 0.9;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void setPrecioCuidado(boolean precioCuidado) {
		this.precioCuidado = precioCuidado;
	}

	public Double getPrecio() {
		if(this.esPrecioCuidado() == false) {
			
			return precio;
			
		}
		
		else {
			
			return this.getPrecioCuidado();
		}
	}
}
