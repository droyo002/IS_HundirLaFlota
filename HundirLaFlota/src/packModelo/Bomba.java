package packModelo;

public class Bomba implements Armamento {
	private int cantidad;
	public Bomba() {
		cantidad=5;
		
	}

	@Override
	public void marcarCasilla(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCantidad(int pCantidad) {
		// TODO Auto-generated method stub
		cantidad+=pCantidad;
	}

	@Override
	public void restarCantidad(int pCantidad) {
		// TODO Auto-generated method stub
		cantidad-=pCantidad;
	}
	

}
