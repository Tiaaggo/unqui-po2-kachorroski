package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean precioCuidado, Integer descuento) {
		
		super(nombre, precio, precioCuidado, descuento);
		
		
	}

	public Double getPrecio() {
		if(this.esPrecioCuidado()) {
			
			return super.getPrecio() -(super.getPrecio() * super.getDescuento() / 100);
		}
		
		else {
			
			return super.getPrecio();
		}
	}
}