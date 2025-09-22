package ar.edu.unq.po2.tp4.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;
import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad lechita;
	private Producto vino;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, true, 20);
		vino = new Producto("Vino", 5d);
		lechita = new ProductoPrimeraNecesidad("Lechita", 8d, false, 20);
	}
	
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(6.4), leche.getPrecio());
		assertEquals(vino.getPrecio(), new Double(5));
		assertEquals(lechita.getPrecio(), new Double(8));
	}
	
}
