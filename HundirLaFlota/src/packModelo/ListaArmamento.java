package packModelo;

import java.util.ArrayList;

public class ListaArmamento {
	private ArrayList<Armamento> lista;

	public ListaArmamento() {
		lista = new ArrayList<Armamento>();
		lista.add(new Radar());
		lista.add(new Escudo());
		lista.add(new Bomba());
		lista.add(new MisilDirigido());
		lista.add(new Misil());

	}

	public void add(int pTipo,int cantidad) {
		switch (pTipo) {
		case 2:
			this.lista.get(1).addCantidad(cantidad);
			break;
		
		case 3:
			this.lista.get(2).addCantidad(cantidad);
			break;
	
		case 4:
			this.lista.get(3).addCantidad(cantidad);
			break;
	
		case 5:
			this.lista.get(4).addCantidad(cantidad);
			break;
}

}}
