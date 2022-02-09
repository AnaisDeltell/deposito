import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testFill {
	private double depMax;
	private double depNivel;


	@Test
	void test() {
		DepositoCombustible tank = new DepositoCombustible(40.0, 5.0);
		tank.fill(10.0);
		assertEquals(15.0, tank.getDepositoNivel());

	}

}
