package packModelo;

import java.util.List;

public class Destructor extends TBarco{
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud = 2;
	
	public Destructor(){
		
	}
	
	public int getLongitud(){
		return this.longitud;
	}
}
