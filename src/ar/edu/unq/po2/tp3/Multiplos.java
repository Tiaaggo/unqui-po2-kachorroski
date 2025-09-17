package ar.edu.unq.po2.tp3;

public class Multiplos {
	
	
	public Integer multiploMayor(Integer x, Integer y) {
		
		
		Integer multiploMinimo = -1;
		Integer multiploMaximo = 1000;
		
		if(x <= 0 | y <= 0) {
			
			return multiploMinimo;
			
		}
		
		while(multiploMaximo != 0) {
			
			if(multiploMaximo % x == 0 && multiploMaximo % y == 0) {
				
				return multiploMaximo;
			}
			
			else {
				
				multiploMaximo = multiploMaximo - 1;
				
			}
		
		}
			
			return multiploMinimo;
			
	}
	
}
