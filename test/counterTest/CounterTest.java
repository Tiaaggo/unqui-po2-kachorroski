package counterTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

class CounterTest {

	Counter counter;
	
	@BeforeEach
	void setUp() throws Exception {
		counter = new Counter();
		
		ArrayList<Integer> listaDePrueba = new ArrayList<Integer>();
		listaDePrueba.add(1);
		listaDePrueba.add(2);
		listaDePrueba.add(3);
		listaDePrueba.add(4);
		listaDePrueba.add(5);
		listaDePrueba.add(6);
		listaDePrueba.add(7);
		counter.setNumeros(listaDePrueba);
	}

	@Test
	void test() {
		
		Integer resultadoObtenido;
		
		resultadoObtenido = counter.totalDeNumerosPares();
		
		assertEquals(resultadoObtenido, 3);
	}
	
	@Test
	void test2() {
		
		Integer resultadoObtenido;
		
		resultadoObtenido = counter.totalDeNumerosImpares();
		
		assertEquals(resultadoObtenido, 4);
	}
	
	@Test
	void test3() {
		
		Integer resultadoObtenido;
		
		resultadoObtenido = counter.totalDeMultiplos(2);
		
		assertEquals(resultadoObtenido, 3);
	}

}
