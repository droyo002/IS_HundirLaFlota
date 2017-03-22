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
	private Iterator<TBarco> getIterador(){
		return this.flota.iterator();
	}
	public boolean comprobarPosiciones(int pX,int pY) {
		boolean libre = true;
		Iterator <TBarco> it= flota.iterator();
		TBarco b;
		while(it.hasNext()&&libre){
			b=(TBarco)it.next();
			for(int i=pX-1;pX<=pX+1;pX++){
				for(int j=pY-1; pY<=pY+1;pY++){
					if(j!=pY&&i!=pX){
						if(b.esta(j,i)){
							libre=false;
						}
					}
				}
			}
		}
		return libre;
	}
}
