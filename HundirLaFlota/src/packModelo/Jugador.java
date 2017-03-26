package packModelo;

public interface Jugador {
	public void atacarPosicion(int pX,int pY);
	public void ponerEscudo(int pX,int pY);
	private void comprobarColocacion(TBarco pBarco);
	public void generaryColocarBarco(int pX, int pY, String pDir);
	public void eliminarBarco(int pX,int pY);
	public void repararBarco(int pX,int pY);
	public void comprar(TBarco pBarco);
}
