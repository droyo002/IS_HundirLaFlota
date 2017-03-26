package packTest;
import packModelo;
import static org.junit.Assert.*;

import org.junit.Test;

public class ArmamentoTest {
	
	@Test
	public void test() {
		//Creación de escudos
		Armamento ar;
		ar=ArmamentoFactory.getArmamentoFactory().crearArmamento("Escudo", 10);
		assertTrue(ar instanceof Escudo);
		ar=ArmamentoFactory.getArmamentoFactory().crearArmamento("Bomba", 10);
		assertTrue(ar instanceof Bomba);
		ar=ArmamentoFactory.getArmamentoFactory().crearArmamento("Misil", 10);
		assertTrue(ar instanceof Misil);
		ar=ArmamentoFactory.getArmamentoFactory().crearArmamento("MisilDirigido", 10);
		assertTrue(ar instanceof Misildirigido);
		ar=ArmamentoFactory.getArmamentoFactory().crearArmamento("CualquierCosa"", 10);
		assertTrue(ar==null);
	}
}
