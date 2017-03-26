package packModelo;

import java.util.List;

public class Destructor extends TBarco{
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud = 2;
	
	public Destructor(int px, int pY, String pDir){
		if(pDir=="Sur"){
			for(int i=pX;i<=pX+2;i++){
				pos= new Posicion(pX,i);
				barco.addPos(pos);
			}
		}
		else{
			for(int i=pY;i<=pY+2;i++){
				pos= new Posicion(pX,i);
				barco.addPos(pos);
			}
		}
	}
	
	public int getLongitud(){
		return this.longitud;
	}
}
