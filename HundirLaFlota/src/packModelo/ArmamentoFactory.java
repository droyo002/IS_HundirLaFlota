package packModelo;

public class ArmamentoFactory {
	private static ArmamentoFactory mArmamentoFactory;
	
	private ArmamentoFactory() {
		
	}
	
	public static ArmamentoFactory getArmamentoFactory() {
		if (mArmamentoFactory==null) {
			mArmamentoFactory=new ArmamentoFactory();
		}
		return mArmamentoFactory;
	}
	
	public Armamento crearArmamento(String pArmamento, int pCantidad) {
		Armamento arma=null;
		if (pArmamento.equals("Escudo")) {
			arma= new Escudo(pCantidad);
		}
		else if (pArmamento.equals("Bomba")) {
			arma= new Bomba(pCantidad);
		}
		else if (pArmamento.equals("Misil")) {
			arma= new Misil(pCantidad);
		}
		else if (pArmamento.equals("Misil dirigido")) {
			arma= new MisilDirigido(pCantidad);
		}
		return arma;
		
	}
}
