package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	
	private ArrayList<Integer> numeros;

	public int totalDeNumerosPares() {
		
		int count = 0;
		
		for(Integer numeroActual : numeros) {
			if(numeroActual % 2 == 0) {
				
				count = count + 1;
			}
			
		}
		
		return count;
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	
	
}

