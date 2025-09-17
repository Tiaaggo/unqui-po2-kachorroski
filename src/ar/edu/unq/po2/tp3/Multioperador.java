package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numeros;
	
	public Integer sumatoria() {
		
		Integer contador = 0;
		
		for(Integer numeroActual : numeros) {
			
			contador = contador + numeroActual;
		}
		
		return contador;
	}
	
	public Integer resta() {
		
		Integer contador = 0;
		
		for(Integer numeroActual : numeros) {
			
			contador = contador - numeroActual;
		}
		
		return contador;
	}

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public Integer multiplicacion() {
		
		Integer contador = 1;
		
		for(Integer numeroActual : numeros) {
			
			contador = contador * numeroActual;
		}
		
		return contador;
	}

}
