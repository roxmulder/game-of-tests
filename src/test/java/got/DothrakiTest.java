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
		khal = new Dothraki(5);
	}
	
	@Test
	void test_esKamikaze() {
		assertTrue(khal.esKamikaze(), "Testing Es kamikaze");
	}
	
	@Test
	void test_potenciaDeAtaque(){
		assertEquals(25, khal.potenciaDeAtaque());
	}
}
