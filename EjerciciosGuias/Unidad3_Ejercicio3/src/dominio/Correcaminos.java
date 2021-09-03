package dominio;

public class Correcaminos extends Animal{

	public Correcaminos(int peso, int posicion, int energia) {
		super(peso, posicion, energia);
	}
	
	public String toString() {
		return "Correcaminos --> Peso: " + peso + " kg , Posicion: " + posicion + " , Energia: " + energia; 
	}
	
	public double obtenerVelocidad() {
		
		double velocidad;
		
		velocidad = 10 - peso;
		
		return Math.abs(velocidad);
	}
}
