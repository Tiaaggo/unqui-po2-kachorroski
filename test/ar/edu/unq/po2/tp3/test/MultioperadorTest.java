package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTest {
	
	Multioperador multioperador = new Multioperador();

	@BeforeEach
	void setUp() throws Exception {
		
		ArrayList<Integer> listaDePrueba = new ArrayList<Integer>();
		listaDePrueba.add(5);
		listaDePrueba.add(5);
		listaDePrueba.add(2);
		multioperador.setNumeros(listaDePrueba);
	}

	@Test
	void test() {
		
		Integer resultadoEsperado = 12;
		
		assertEquals(resultadoEsperado, multioperador.sumatoria());
	}
	
	@Test
	void test2() {
		
		Integer resultadoEsperado = 50 ;
		
		assertEquals(resultadoEsperado, multioperador.multiplicacion());
	}
	
	@Test
	void test3() {
		
		Integer resultadoEsperado = -12 ;
		
		assertEquals(resultadoEsperado, multioperador.resta());
	}

}
