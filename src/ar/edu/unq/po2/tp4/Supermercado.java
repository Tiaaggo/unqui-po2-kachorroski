package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private ArrayList<Producto> listaDeProductos;
	
	public Supermercado(String nombre, String direccion) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.listaDeProductos = new ArrayList();
		
	}
	
	public Integer getCantidadDeProductos() {
		
		return this.listaDeProductos.size();
		
	}
	
	public void agregarProducto(Producto producto) {
		
		this.listaDeProductos.add(producto);
		
	}
	
	public Double getPrecioTotal() {
		
		Double precioTotal = new Double(0);
		ArrayList<Producto> listaARecorrer = this.listaDeProductos;
		for(Producto productoActual : listaARecorrer) {
			
			precioTotal = precioTotal + productoActual.getPrecio();
			
		}
		
		return precioTotal;
		
	}

}
