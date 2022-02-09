import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class testgetDepositoNIvel {
	private double depMax;
	private double depNivel;

	

	@Test
	void test() {
		DepositoCombustible tank = new DepositoCombustible(40.0, 5.0);
		depNivel = tank.getDepositoNivel();
		assertEquals(5.0, tank.getDepositoNivel());
	}

}
