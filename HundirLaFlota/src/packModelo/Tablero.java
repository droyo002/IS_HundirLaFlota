package packModelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

import Interfaz.VHundirLaFlota;

public class Tablero extends Observable {
	private static int ANCHO=10;
	private static int ALTO=10;
	private List<TBarco> flota;

	public Tablero() {
		flota= new ArrayList<TBarco>();
	}

	public void añadirObserver(VHundirLaFlota h) {
		addObserver(h);
		
	}
	
	public void addBarco (TBarco pBarco){
		
		this.flota.add(pBarco);	
		notificar(pBarco);
		
		
	}	
	
	private void notificar(TBarco pBarco) {
		
		Iterator <Posicion> it= pBarco.getIterador();
		Posicion p;
		while(it.hasNext()){
			
			p= it.next();
			setChanged();
			notifyObservers(calcularPos(p.getX(),p.getY()));
		}
		
	}
	
	private int calcularPos(int pX,int pY) {
		return pY*10+pX;
	}
	
	
	public boolean comprobarHorizontal(int pX, int pY, int longitud) {
		
		boolean flg=true;
		for(int i=pY;i<=pY+longitud;i++){
			if(!this.comprobarPosiciones(pX, i)){
				flg=false;
				break;
			}
		}
		return flg;
	}

	public boolean comprobarVertical(int pX, int pY, int n) {
		boolean flg=true;
		for(int i=pX;i<=pX+n;i++){
			if(!this.comprobarPosiciones(i, pY)){
				flg=false;
				break;
			}
		}
		return flg;
	}

	public void eliminarBarco(TBarco pBarco) {
		flota.remove(pBarco);
	}
	private Iterator<TBarco> getIterador(){
		return this.flota.iterator();
	}
	private boolean comprobarPosiciones(int pX, int pY) {
		boolean libre = true;
		Iterator <TBarco> it= flota.iterator();
		TBarco b;
		while(it.hasNext()&&libre){
			b=(TBarco)it.next();
			for(int i=pX-1;i<=pX+1;i++){
				for(int j=pY-1; j<=pY+1;j++){
					
						if(b.esta(i,j)){
							
							libre=false;
						
					}
				}
			}
		}
		return libre;
	}
}
