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

	public void addBarco (int pX, int pY, String pDir, int pTipo){
		TBarco barco=BarcoFactory.getBarcoFactory().crearBarco(pX,pY,pDir,pTipo);
		int longitud= barco.getLongitud();
		boolean flg=true;
		if(pDir.equals("Sur")){
			flg=this.comprobarVertical(pX, pY, longitud);
			}
		else{
			flg=this.comprobarHorizontal(pX, pY, longitud);}
		if(flg){
			this.flota.add(barco);
		}
	}
	
	

	private boolean comprobarHorizontal(int pX, int pY, int longitud) {
		
		boolean flg=true;
		for(int i=pY;i<=pY+longitud;i++){
			if(!this.comprobarPosiciones(pX, i)){
				flg=false;
				break;
			}
		}
		return flg;
	}

	private boolean comprobarVertical(int pX, int pY, int n) {
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
						if(b.esta(j,i)){
							
							libre=false;
						
					}
				}
			}
		}
		return libre;
	}
}
