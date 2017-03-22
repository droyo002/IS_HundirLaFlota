package packModelo;

public class Posicion {
	private boolean atacado;
	private int x;
	private int y;
	
	public Posicion(int pX, int pY) {
		this.x=pX;
		this.y= pY;
		
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}

}
