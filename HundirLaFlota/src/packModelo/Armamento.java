package packModelo;

public abstract class Armamento {
	private int cantidad;
	private int coste;
	
	public Armamento(int pCantidad) {
		this.cantidad= pCantidad;
	}
	
	
	public void addCantidad(int pCantidad) {
		this.cantidad= this.cantidad + pCantidad;
	}
	public void restarCantidad(int pCantidad) {
		this.cantidad= this.cantidad - pCantidad;
	}
	
	public int getCoste() {
		return this.coste;
	}
	
	public boolean comprobarCantidad(){
		boolean cant=true;
		if (this.cantidad==0){
			cant =false;
		}
		return cant;
	}

}
