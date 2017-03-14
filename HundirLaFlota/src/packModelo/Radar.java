package packModelo;

public class Radar implements Armamento {
	private int consultas;
	private int alto;
	private int ancho;
	
	public Radar () {
		
	}
	@Override
	public void marcarCasilla(int pX, int pY) {
		// TODO Auto-generated method stub
		
	}
	public void vecinos() {
		
	}
	public void restarConsultas() {
		consultas--;
	}
	public int getConsultas() {
		return consultas;
	}
	@Override
	public void addCantidad(int pCantidad) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void restarCantidad(int pCantidad) {
		// TODO Auto-generated method stub
		
	}
	
}
