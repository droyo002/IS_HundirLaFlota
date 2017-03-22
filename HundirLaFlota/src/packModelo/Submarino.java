package packModelo;

import java.util.List;

public class Submarino extends TBarco {
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud = 3;
	
	public Submarino(){
		
	}
	
	public int getLongitud(){
		return this.longitud;
	}
}
