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
		int n= barco.getLongitud();
		boolean flg=true;
		if(pDir.equals("Sur")){
			flg=this.comprobarVertical(pX, pY, n);
			}
		else{
			flg=this.comprobarHorizontal(pX, pY, n);}
		if(flg){
			this.flota.add(barco);
		}
	}
	
	

	private boolean comprobarHorizontal(int pX, int pY, int n) {
		
		boolean flg=true;
		for(int i=pY;i<=pY+n;i++){
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
			for(int i=pX-1;pX<=pX+1;pX++){
				for(int j=pY-1; pY<=pY+1;pY++){
						if(b.esta(j,i)){
							libre=false;
						
					}
				}
			}
		}
		return libre;
	}
}
