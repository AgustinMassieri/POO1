package dominio;

public class Alpiste extends Alimento {

	private double gramos;
	
	@Override
	public String toString() {
		return "Alpiste de " + gramos + " gr.";
	}
	
	public Alpiste(double gramos) {
		this.gramos = gramos;
	}
	
	public double darAporteEnergetico() {
		return 4 * gramos;
	}
}
