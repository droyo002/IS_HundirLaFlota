package packModelo;

import java.util.List;

public class Submarino extends TBarco {
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud = 3;
	
	public Submarino(int px, int pY, String pDir){
	
		if(pDir=="Sur"){
			for(int i=pX;i<=pX+3;i++){
				pos= new Posicion(pX,i);
				barco.addPos(pos);
			}
		}
		else{
			for(int i=pY;i<=pY+3;i++){
				
				pos= new Posicion(pX,i);
				barco.addPos(pos);
			}
		}
	} 
		
	
	public int getLongitud(){
		return this.longitud;
	}
}
