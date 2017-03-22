package packModelo;

import java.util.List;

public class Fragata {
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud = 1;
	
	public Fragata(){
		
	}
	
	public int getLongitud(){
		return this.longitud;
	}
}
