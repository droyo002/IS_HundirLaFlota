package packModelo;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaArmamento {
	private ArrayList<Armamento> lista;

	public ListaArmamento() {
		lista = new ArrayList<Armamento>();
		

	}

	public void add(String pArmamento,int pCantidad) {
		lista.add(ArmamentoFactory.getArmamentoFactory().crearArmamento(pArmamento, pCantidad));
	}
	
	
	
	private Iterator<Armamento> getIterador(){return this.lista.iterator();}
	
	public boolean comprobarArmamento(String pTipo){
		boolean tiene = false;
		Iterator<Armamento> it = lista.iterator();
		
		while(it.hasNext() && tiene==false){
			Armamento ar = it.next();
			
			if (ar.getClass().getSimpleName().equals(pTipo)) {
				
				tiene=ar.comprobarCantidad();
			}
		}
		return tiene;
	}
	
	public void restarArmamento(String pTipo){
		
		Iterator<Armamento> it = lista.iterator();
		
		while(it.hasNext() ){
			Armamento ar = it.next();
			
			if (ar.getClass().getSimpleName().equals(pTipo)) {
				ar.restarCantidad(1);
			}
		}
		
	}
	
	

}
