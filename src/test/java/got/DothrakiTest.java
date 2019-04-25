package got;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

class DothrakiTest {
	private Dothraki khal;
	
	@BeforeEach
	void init() {
		//tiene 5 tatuajes
		khal = new Dothraki(5);
	}
	
	@Test
	void test_esKamikaze() {
		assertTrue(khal.esKamikaze(), "Testing Es kamikaze dothraki");
	}
	
	@Test
	void test_potenciaDeAtaque(){
		assertEquals(25, khal.potenciaDeAtaque(), "Testing potencia de ataque dothraki");
	}
}
