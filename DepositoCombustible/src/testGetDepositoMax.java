import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testGetDepositoMax {

	private double depMax;
	private double depNivel;

	@Test
	void test() {
		DepositoCombustible tank = new DepositoCombustible(40.0, 5.0);
		depMax = tank.getDepositoMax();
		assertEquals(40.0, tank.getDepositoMax());

	}

}
