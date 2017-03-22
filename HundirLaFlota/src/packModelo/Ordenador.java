package packModelo;

public class Ordenador implements Jugador {
	private ListaArmamento armas;
	private Ordenador mOrdenador;
	private int dinero=2000;
	
	private Ordenador() {
		armas= new ListaArmamento();
	}
	
	public Ordenador getOrdenador() {
		if (mOrdenador==null) {
			mOrdenador=new Ordenador();
		}
		return mOrdenador;
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
	public void colocarBarco(int pX, int pY, int pLength) {
		// TODO Auto-generated method stub
		for (int i = 0; i > pLength-1; i++) {
			if (revisarVecinos(pX)) {
				
			}
		}
	}
	public void colocarBarcoVertical(int pX, int pY, int pLength) {
		// TODO Auto-generated method stub
		for (int i = 0; i > pLength-1; i++) {
			if (revisarVecinos(pX)) {
				
			}
		}
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
