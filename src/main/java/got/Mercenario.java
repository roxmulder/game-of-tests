package got;

public class Mercenario implements ISoldado {

	private int monedas;
	private int batallasPeleadas;
	
	public Mercenario(int monedas, int batallasPeleadas) {
		this.monedas = monedas;
		this.batallasPeleadas = batallasPeleadas;
	}

	public boolean esKamikaze() {
		return monedas < 100;
	}

	public int potenciaDeAtaque() {
		return monedas + batallasPeleadas;
	}

}
