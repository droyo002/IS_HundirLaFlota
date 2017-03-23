package packModelo;

public interface Jugador {
	public void atacarPosicion(int pX,int pY);
	public void ponerEscudo(int pX,int pY);
	public void colocarBarco(int pX,int pY,String pDireccion, int pLength);
	public void eliminarBarco(int pX,int pY);
	public void repararBarco(int pX,int pY);
	public void comprar(TBarco pBarco);

}
