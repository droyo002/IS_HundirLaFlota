package packModelo;

import java.util.List;

public class Submarino extends TBarco {
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud = 3;
	
	public Submarino(int pX, int pY, String pDir){
	
		if(pDir=="Sur"){
			for(int i=pX;i<=pX+3;i++){
				Posicion pos= new Posicion(pX,i);
				posiciones.add(pos);
			}
		}
		else{
			for(int i=pY;i<=pY+3;i++){
				
				Posicion pos= new Posicion(pX,i);
				posiciones.add(pos);
			}
		}
	} 
		
	
	public int getLongitud(){
		return this.longitud;
	}
}
