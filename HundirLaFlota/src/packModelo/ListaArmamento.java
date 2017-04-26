package packModelo;

import java.util.ArrayList;

public class ListaArmamento {
	private ArrayList<Armamento> lista;

	public ListaArmamento() {
		lista = new ArrayList<Armamento>();
		

	}

	public void add(String pArmamento,int pCantidad) {
		lista.add(ArmamentoFactory.getArmamentoFactory().crearArmamento(pArmamento, pCantidad));
	}
	
	

}
