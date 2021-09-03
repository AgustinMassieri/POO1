package dominio;

public class Persona {

	private String nombre;
	private double peso;
	private Canasta canasta;
	
	public Persona(String nombre, double peso, Canasta canasta) {
		this.nombre = nombre;
		this.peso = peso;
		this.canasta = canasta;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setCanasta(Canasta canasta) {
		this.canasta = canasta;
	}
	
	public Canasta getCanasta() {
		return canasta;
	}
	
	public void tirarManzana(Lobo lobo, Manzana manzana) {
		canasta.sacarManzana();
		lobo.comerManzana(manzana);
	}
	
	@Override
	public String toString() {
		return "Soy " + nombre + " , peso " + peso + " kg y mi canasta tiene " + canasta.getCantidadDeManzanas() + " manzanas.";
	}
}
