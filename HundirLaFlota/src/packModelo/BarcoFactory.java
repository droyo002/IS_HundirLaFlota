package packModelo;

public class BarcoFactory {
	private static BarcoFactory mFactory=new BarcoFactory();
	
	
	private BarcoFactory(){}
	public static getBarcoFactory(){return mFactory;}
	public crearBarco(int pX, int pY, String pDir, int pTipo){
		TBarco barco;
		Posicion pos;
		switch(pTipo){
		case 0:
			barco=new Fragata();
			break;
		case 1:
			barco=new Destructor();
			break;
		case 2:
			barco=new Submarino();
			break;
		case 3:
			barco=new Portaviones();
			break;		
		}
		if(pDir=="Sur"){
			for(int i=pX;pX<=pX+pTipo;i++){
				pos= new Posicion(pX,i);
				barco.addPos(pos);
			}
		}
		else{
			for(int i=pY;pY<=pY+pTipo;i++){
				pos= new Posicion(pX,i);
				barco.addPos(pos);
			}
		}
	}
}
