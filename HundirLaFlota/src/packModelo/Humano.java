package packModelo;

public class Humano implements Jugador {
	
	private ListaArmamento armas;
	private Tablero tablero;
	private static Humano mHumano;
	private int dinero=2000;
	
	private Humano() {
		armas= new ListaArmamento();
		tablero= new Tablero();
	}
	
	public static Humano getHumano() {
		if (mHumano==null) {
			mHumano=new Humano();
		}
		return mHumano;
	}
	@Override
	public void atacarPunto(int pX, int pY) {
		// TODO Auto-generated method stub
		armas.comprobarArmamento(pTipo);
	}
	
	
	
	@Override
	public void ponerEscudo(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}
	public void generaryColocarBarco(int pX, int pY, String pDireccion,int pTipo){
		TBarco barco=BarcoFactory.getBarcoFactory().crearBarco(pX,pY,pDireccion,pTipo);
		
		if(comprobarColocacion(pX,pY,pDireccion,barco.getLongitud())){
			this.tablero.addBarco(barco);
		}
	}
	
	
	private boolean comprobarColocacion(int pX, int pY,String pDireccion, int pL) {
		boolean flag =true;
		if(pDireccion.equals("Sur")){
			flag=this.tablero.comprobarVertical(pX,pY,pL);
		}
		else{
			flag=this.tablero.comprobarHorizontal(pX,pY,pL);
		}
		return flag;
	}
	
	private boolean revisarVecinos(int pX) {
		return false;
	}

	@Override
	public void eliminarBarco(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void repararBarco(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(TBarco pBarco) {
		// TODO Auto-generated method stub
		
	}

}
