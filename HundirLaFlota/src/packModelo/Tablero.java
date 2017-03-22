package packModelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tablero {
	private static int ANCHO=10;
	private static int ALTO=10;
	
	private List<TBarco> flota;
	
	public Tablero() {
		flota= new ArrayList<TBarco>();
	}
	
	public void addBarco (TBarco pBarco) {
		flota.add(pBarco);
	}
	
	public void eliminarBarco(TBarco pBarco) {
		flota.remove(pBarco);
	}
	
	public boolean comprobarPosiciones(int pX,int pY) {
		boolean libre = true;
		Iterator <TBarco> it= flota.iterator();
		TBarco b = it.next();
		if(libre==true && b.esta(pX, pY)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX+1, pY)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX+1, pY-1)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX, pY-1)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX-1, pY-1)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX-1, pY)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX-1, pY+1)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX, pY+1)==true){
			libre = false;
		}
		if(libre==true && b.esta(pX+1, pY+1)==true){
			libre = false;
		}
		return libre;
	}
	
	public void comprobarHorizontal(int pAlto) {
		
	}
	
	public void comprobarVertical(int pAncho) {
		
	}
	
	

	
}
