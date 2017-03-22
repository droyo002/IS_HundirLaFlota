package packModelo;

public class HundirFlota {
	private static HundirFlota mHundirFlota=null;
	private Humano mHumano;
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
		almacen.add(2, 50);
		almacen.add(3, 50);
		almacen.add(4, 50);
		almacen.add(5, 50);
		
	}
	
	public void inicializarPartida() {
		
	}
	
	public void comenzarPartida() {
		
	}
	
	public boolean posicionApta(int pX, int pY){
		boolean apta = false;
		
		
		
		return apta;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HundirFlota.getHundirFlota().cargarAlmacen();
		int i;
	}

}
