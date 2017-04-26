package packModelo;

public class Bomba extends Armamento {
	private int cantidad;
	public Bomba(int pCantidad) {
		super(pCantidad);
		
	}

	
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
