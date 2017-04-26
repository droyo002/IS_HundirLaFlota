package packModelo;

import java.util.ArrayList;
import java.util.List;

public class Destructor extends TBarco{
	
	
	public Destructor(int pX, int pY, String pDir){
		longitud = 2;
		
		if(pDir=="Vertical"){
			for(int i=pX;i<pX+longitud;i++){
				Posicion pos= new Posicion(pX,i);
				posiciones.add(pos);
			}
		}
		else{
			for(int i=pY;i<pY+longitud;i++){
				Posicion pos= new Posicion(pX,i);
				posiciones.add(pos);
			}
		}
	}
	
	public int getLongitud(){
		return this.longitud;
	}
}
