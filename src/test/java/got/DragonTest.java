package got;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

class DragonTest {
	private Dragon drogon;
	
	@BeforeEach
	void init() {
		drogon = new Dragon(100,100,100);
		//pueden crear otros dragones con otras caracteristicas
		//y hacer otros tests como para cubrir todos los angulos
		//por ejemplo, uno que no sea adulto
	}
	
	@Test
	void test_esKamikaze() {
		assertFalse(drogon.esKamikaze(), "Testing Es kamikaze dragon");
	}
	
	@Test
	void test_potenciaDeAtaque(){
		assertEquals(300, drogon.potenciaDeAtaque(), "Testing potencia de ataque dragon");
	}
	
	@Test
	void test_esAdulto() {
		assertTrue(drogon.esAdulto(), "Testing Es adulto");
	}
	
	@Test
	void test_estaFeliz() {
		assertTrue(drogon.estaFeliz(), "Testing Esta feliz");
	}
	
	@Test
	void test_puedeAtacar() {
		assertTrue(drogon.puedeAtacar(), "Testing puede atacar");
	}
}
