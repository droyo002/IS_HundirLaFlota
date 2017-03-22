package packModelo;

import java.util.Iterator;
import java.util.List;

public class TBarco {
	private List<Posicion> posiciones;
	private Escudo escudo;
	private int longitud;
	
	public TBarco(){
		
	}
	
	public boolean esta(int pX, int pY){
		boolean esta = false;
		Iterator<Posicion> it = posiciones.iterator();
		while(it.hasNext() && esta==false){
			Posicion pos = it.next();
			if(pos.getX()==pX && pos.getY()==pY){
				esta = true;
			}
		}
		return esta;
	}
	
	public void addEscudo(){
		escudo = new Escudo();
	}
	
	public void restarEscudo(){
		escudo.restarImpactos();
	}
	
	public int getLongitud(){
		return this.longitud;
	}
	
}
