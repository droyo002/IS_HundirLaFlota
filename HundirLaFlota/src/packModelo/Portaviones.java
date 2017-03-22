package packModelo;

import java.util.List;

public class Portaviones extends TBarco  {
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud = 4;
	
	public Portaviones(){
		
	}
	
	public int getLongitud(){
		return this.longitud;
	}
}
