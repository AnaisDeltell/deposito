import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testEstaLleno {
	private double depMax;
	private double depNivel;


	@Test
	void test() {
		DepositoCombustible tank = new DepositoCombustible(40.0, 5.0);
		tank.fill(35.0);
		assertEquals(true, tank.estaLleno());

	}

}
