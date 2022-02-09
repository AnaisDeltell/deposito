import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEstaVacio {
	private double depMax;
	private double depNivel;

	@Test
	void test() {
		
		DepositoCombustible tank = new DepositoCombustible(40.0, 10.0);
		tank.consumir(10.0);
		assertEquals(true, tank.estaVacio());

	}

}
