package packModelo;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class TBarco {
	protected List<Posicion> posiciones;
	protected Escudo escudo;
	protected int longitud;
	protected int cantidad;
	
	public TBarco(){
		this.posiciones=new ArrayList<Posicion>();
	}
	
	public Iterator<Posicion> getIterador(){return this.posiciones.iterator();}
	
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
		escudo = new Escudo(0);
	}
	public void addPos(Posicion pPos){
		this.posiciones.add(pPos);
	}
	public void restarEscudo(){
		escudo.restarImpactos();
	}
	
	public int getLongitud(){
		return this.longitud;
	}
	
	public void restarCantidad() {
		cantidad--;
	}
	public List<Posicion> getPosiciones() {
		return posiciones;
	}
}
