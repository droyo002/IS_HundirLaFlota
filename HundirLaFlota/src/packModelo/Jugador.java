package packModelo;

public interface Jugador {
	public void atacarPunto(int pX,int pY,String pArma);
	public void ponerEscudo(int pX,int pY);
	public void generaryColocarBarco(int pX, int pY, String pDir,int pTipo);
	public void eliminarBarco(int pX,int pY);
	public void repararBarco(int pX,int pY);
	public void comprar(TBarco pBarco);
	public boolean comprobarAlmacen(String pTipo);
}
