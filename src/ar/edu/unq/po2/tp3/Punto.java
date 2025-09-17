package ar.edu.unq.po2.tp3;

public class Punto {

		private Integer x;
		private Integer y;
		
		public Punto() {
			
			super();
			this.x = 0;
			this.y = 0;
			
		}
		
		public Punto(Integer puntoX, Integer puntoY) {
			super();
			this.x = puntoX;
			this.y = puntoY;
			
		}
		
		public void moverPuntoA(Integer puntoX, Integer puntoY) {
			
			this.setX(puntoX);
			this.setY(puntoY);
			
		}
		
		public Punto sumadoConPunto(Punto puntoASumar) {
			
			Integer nuevaX;
			Integer nuevaY;
			
			nuevaX = this.getX() + puntoASumar.getX();
			nuevaY = this.getY() + puntoASumar.getY();
			
			return new Punto(nuevaX, nuevaY);
			
		}
		
		public Integer getX() {
			return x;
		}
		public void setX(Integer puntoX) {
			this.x = puntoX;
		}
		public Integer getY() {
			return y;
		}
		public void setY(Integer puntoY) {
			this.y = puntoY;
		}
	
		
		
}
