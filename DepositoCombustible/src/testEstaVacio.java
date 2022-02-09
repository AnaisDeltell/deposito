import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEstaVacio {
	private double depMax;
	private double depNivel;

	@Test
	void test() {
		
		DepositoCombustible tank = new DepositoCombustible(40.0, 5.0);
		tank.consumir(5.0);
		assertEquals(0.0, tank.getDepositoNivel());

	}

}
