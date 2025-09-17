package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multiplos;

class MultiplosTest {

	Multiplos multiplo;
	
	@BeforeEach
	void setUp() throws Exception {
		
		multiplo = new Multiplos();
		
	}

	@Test
	void test() {
		
		Integer resultadoObtenido = -1;
		
		assertEquals(resultadoObtenido, multiplo.multiploMayor(500, 267));
	}
	
	
	@Test
	void test2() {
		
		Integer resultadoObtenido = 950;
		
		assertEquals(resultadoObtenido, multiplo.multiploMayor(1, 95));
		
	}
	
	
	@Test
	void test3() {
		
		Integer resultadoObtenido = -1;
		
		assertEquals(resultadoObtenido, multiplo.multiploMayor(0, -2));
	}
	
	
	@Test
	void test4() {
		
		Integer resultadoObtenido = 567;
		
		assertEquals(resultadoObtenido, multiplo.multiploMayor(1, 567));
		
	}
	
	
}
