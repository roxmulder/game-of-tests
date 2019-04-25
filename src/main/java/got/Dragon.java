package got;

public class Dragon implements ISoldado {

	private int felicidad;
	private int largo;
	private int potenciaDeFuego;
	
	public Dragon(int felicidad, int largo, int potenciaDeFuego) {
		this.felicidad = felicidad;
		this.largo = largo;
		this.potenciaDeFuego = potenciaDeFuego;
	}

	public boolean esKamikaze() {
		return false;
	}

	public int potenciaDeAtaque() {
		return 3 * potenciaDeFuego;
	}

	public boolean puedeAtacar() {
		return estaFeliz() && esAdulto();
	}
	
	public boolean esAdulto() {
		return largo > 15 && potenciaDeFuego >= 10;
	}

	public boolean estaFeliz() {
		return felicidad > 50;
	}
	
}
