package packModelo;

public class BarcoFactory {
	private static BarcoFactory mFactory=new BarcoFactory();
	
	
	private BarcoFactory(){}
	public static BarcoFactory getBarcoFactory(){return mFactory;}
	public TBarco crearBarco(int pX, int pY, String pDir, int pTipo){
		TBarco barco=null;
		Posicion pos;
		switch(pTipo){
		case 0:
			barco=new Fragata(pX,pY,pDir);
			break;
		case 1:
			barco= new Destructor(pX,pY,pDir);
			break;
		case 2:
			barco=new Submarino(pX,pY,pDir);
			break;
		case 3:
			barco=new Portaviones(pX,pY,pDir);
			break;		
		}
		return barco;
	}
}
