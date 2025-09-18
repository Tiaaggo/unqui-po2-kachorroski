package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;

class CuadradoTest {

	Cuadrado cuadrado;
	
	@BeforeEach
	void setUp() throws Exception {
		
		cuadrado = new Cuadrado(2, 0, 2);
	}

	@Test
	void test() {
		
		Integer resultadoEsperado = 4;
		
		assertEquals(resultadoEsperado, cuadrado.area());
	}
	
	@Test
	void test2() {
		
		Integer resultadoEsperado = 8;
		
		assertEquals(resultadoEsperado, cuadrado.perimetro());
	}

}
