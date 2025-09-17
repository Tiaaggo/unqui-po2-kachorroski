package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Punto;

class PuntoClass {

	Punto punto;
	Punto otroPunto;
	
	@BeforeEach
	void setUp() throws Exception {
		
		punto = new Punto();
		otroPunto = new Punto(5, 3);
	}

	@Test
	void test() {
		
		assertEquals(0, punto.getX());
		assertEquals(0, punto.getY());
		
	}
	
	@Test
	void test2() {
		
		assertEquals(5, otroPunto.getX());
		assertEquals(3, otroPunto.getY());
		
	}
	
	@Test
	void test3() {
		
		otroPunto.moverPuntoA(2, 2);
		
		assertEquals(2, otroPunto.getX());
		assertEquals(2, otroPunto.getY());
		
	}
	
	@Test
	void test4() {
		
		Punto nuevoPunto = otroPunto.sumadoConPunto(otroPunto);
		
		assertEquals(10, nuevoPunto.getX());
		assertEquals(6, nuevoPunto.getY());
		
	}
	
	

}
