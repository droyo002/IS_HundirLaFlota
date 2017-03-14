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
			Escudo es=(Escudo) this.lista.get(2);
			es.addCantidad(cantidad);
			break;
		

		case 3:
			Bomba bb=(Bomba) this.lista.get(3);
			bb.addCantidad(cantidad);
			break;
	
		case 4:

			MisilDirigido md = (MisilDirigido) this.lista.get(4);
			md.addCantidad(cantidad);
			break;
	
		case 5:
			Misil ms = (Misil) this.lista.get(5);
			ms.addCantidad(cantidad);
			break;
}

}}
