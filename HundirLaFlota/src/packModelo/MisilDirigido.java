package packModelo;

public class MisilDirigido implements Armamento{
	private int cantidad;
	public MisilDirigido() {
		cantidad=0;
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
