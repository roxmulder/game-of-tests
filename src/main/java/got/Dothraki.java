package got;

public class Dothraki implements ISoldado {
	private int tatuajes;

	public Dothraki(int tatuajes) {
		this.tatuajes = tatuajes;
	}
	
	public boolean esKamikaze() {
		return true;
	}
	
	public int potenciaDeAtaque() {
		return 5 * tatuajes;
	}
}
