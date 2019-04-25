package got;

public class Caballero implements ISoldado {
	private boolean esRomantico;
	private int corazonesRotos;
	private int nivelDeCaballerosidad;

	public Caballero(boolean esRomantico, int corazonesRotos, int nivelDeCaballerosidad) {
		this.esRomantico = esRomantico;
		this.corazonesRotos = corazonesRotos;
		this.nivelDeCaballerosidad = nivelDeCaballerosidad;
	}

	public boolean esKamikaze() {
		return esRomantico;
	}

	public int potenciaDeAtaque() {
		return corazonesRotos + 2 * nivelDeCaballerosidad;
	}
	
}
