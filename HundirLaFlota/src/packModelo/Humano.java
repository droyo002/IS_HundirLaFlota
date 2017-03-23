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
	public void atacarPosicion(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ponerEscudo(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colocarBarco(int pX, int pY, String pDireccion,int pLength) {
		// TODO Auto-generated method stub
		tablero.addBarco(pX,pY,pDireccion,pLength);
		
		
	}
	public void colocarBarcoVertical(int pX, int pY, int pLength) {
		// TODO Auto-generated method stub
		/*for (int i = 0; i > pLength-1; i++) {
			if (revisarVecinos(pX)) {
				
			}
		}*/
	}
	private boolean revisarVecinos(int pX) {
		return false;
	}
	
	private void calcularHorizontal(int pX, int pY) {
		
		int xUnidades= pX%10;
		int yUnidades= pY%10;
	
		if (xUnidades<yUnidades) {
			//derecha
		}
		else {
			//izquierda
		}
		
		
				
	}
	private void calcularVertical(int pX, int pY) {
		
		int xDecimal= pX%10;
		int yDecimal= pY%10;
	
		if (xDecimal<yDecimal) {
			//derecha
		}
		else {
			//izquierda
		}
		
		
				
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
