package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Rectangulo;

class RectanguloTest {

	Rectangulo rectangulo;
	
	@BeforeEach
	void setUp() throws Exception {
		
		rectangulo = new Rectangulo(2, 4, 5, 4);
		
	}

	@Test
	void test() {
		
		Integer resultadoEsperado = 20;
		
		assertEquals(resultadoEsperado, rectangulo.area());
		
	}
	
	@Test
	void test2() {
		
		Integer resultadoEsperado = 18;
		
		assertEquals(resultadoEsperado, rectangulo.perimetro());
		
	}
	
	@Test
	void test3() {
		
		String resultadoEsperado = "Vertical";
		
		assertEquals(resultadoEsperado, rectangulo.verticalUHorizontal());
		
	}


}
