package dominio;

public class Persona {
	
	private double peso;

	public Persona(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
	
	@Override
	public String toString() {
		return ">> Persona con peso de: " + peso + " kg.";
	}
}
