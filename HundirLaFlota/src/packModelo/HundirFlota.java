package packModelo;

public class HundirFlota {
	private static HundirFlota mHundirFlota=null;
	private ListaArmamento almacen;
	
	private HundirFlota() {
		almacen=new ListaArmamento();
		
	}
	
	public static HundirFlota getHundirFlota() {
		if (mHundirFlota==null) {
			mHundirFlota= new HundirFlota();
		}
		return mHundirFlota;
	}
	
	public void colocarBarco(int pX,int pY) {
		//mHumano.colocarBarco(pX, pY);
	}
	
	public void cargarAlmacen() {
		almacen.add("Escudo",50);
		almacen.add("Bomba", 50);
		almacen.add("Misil", 50);
		almacen.add("Misil dirigido", 50);
	}
	
	public void inicializarPartida() {
		
	}
	
	public void comenzarPartida() {
		
	}
	public void colocarBarco(int pX, int pY,String pDireccion, int pTipo) {
		Humano.getHumano().generaryColocarBarco(pX, pY,pDireccion, pTipo);
	}
	
	public boolean posicionApta(int pX, int pY){
		boolean apta = false;
		
		
		
		return apta;
	}
	
	public void listaTipoBarco() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HundirFlota.getHundirFlota().cargarAlmacen();
		Humano.getHumano().generaryColocarBarco(5, 5,"Sur", 3);
		Humano.getHumano().generaryColocarBarco(3, 3,"Sur", 2);
		Humano.getHumano().generaryColocarBarco(3, 4,"Sur", 1);
		Humano.getHumano().generaryColocarBarco(5, 5,"Sur", 3);
		int i;
	}

}
