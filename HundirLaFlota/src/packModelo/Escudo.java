package packModelo;

public class Escudo implements Armamento {
	private int numeroImpactos=2;
	private int cantidad;

	public Escudo() {
		
	}
	@Override
	public void marcarCasilla(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}
	
	public void restarImpactos () {
		numeroImpactos--;
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
