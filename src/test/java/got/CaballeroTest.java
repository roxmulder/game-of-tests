package got;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

class CaballeroTest {
	private Caballero jorah;
	private Caballero mountain;
	
	@BeforeEach
	void init() {
		//jorah es romantico, tiene 3 corazones rotos
		//y 5 de nivel de caballerosidad
		jorah = new Caballero(true, 3, 5);
		//mountain es un caballero no muy caballeroso :P
		mountain = new Caballero(false,0,0);
	}
	
	@Test
	void test_esKamikaze_jorah() {
		assertTrue(jorah.esKamikaze(), "Testing Es kamikaze jorah");
	}
	
	@Test
	void test_esKamikaze_mountain() {
		//mountain no es romantico
		assertFalse(mountain.esKamikaze(), "Testing Es kamikaze mountain");
	}
	
	@Test
	void test_potenciaDeAtaque(){
		assertEquals(13, jorah.potenciaDeAtaque(), "testing potencia de ataque caballero");
	}
}
