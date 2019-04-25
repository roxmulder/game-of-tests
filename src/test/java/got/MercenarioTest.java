package got;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

class MercenarioTest {
	private Mercenario darius;
	private Mercenario juancito;
	
	@BeforeEach
	void init() {
		//darius tiene 200 monedas y 25 batallas
		darius = new Mercenario(200, 25);
		juancito = new Mercenario(10, 10);
	}
	
	@Test
	void test_esKamikaze_darius() {
		assertFalse(darius.esKamikaze(), "Testing Es kamikaze mercenario Darius");
	}
	
	@Test
	void test_esKamikaze_juancito() {
		assertTrue(juancito.esKamikaze(), "Testing Es kamikaze mercenario Juancito");
	}
	@Test
	void test_potenciaDeAtaque(){
		assertEquals(225, darius.potenciaDeAtaque(), "Testing Potencia de ataque mercenario");
	}
}
