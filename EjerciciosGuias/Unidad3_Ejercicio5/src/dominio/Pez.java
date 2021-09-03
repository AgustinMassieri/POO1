package dominio;

public class Pez extends Alimento {

	private int edad;
	
	public Pez(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Pez de " + edad + " a�os.";
	}
	
	public double darAporteEnergetico() {
		return Math.sqrt(edad);
	}
}
