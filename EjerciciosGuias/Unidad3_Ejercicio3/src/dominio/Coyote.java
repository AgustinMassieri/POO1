package dominio;

public class Coyote extends Animal {

	public Coyote(int peso, int posicion, int energia) {
		super(peso, posicion, energia);
	}
	
	@Override
	public String toString() {
		return "Coyote --> Peso: " + peso + " kg , Posicion: " + posicion + " , Energia: " + energia; 
	}
	
	public boolean puedeAtrapar(Correcaminos correcaminos) {
	
		double velocidadCorrecaminos = correcaminos.obtenerVelocidad();
		double velocidadCoyote = this.obtenerVelocidad();
		
		if( velocidadCoyote > velocidadCorrecaminos ) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean correrCorrecaminos(Correcaminos correcaminos) {
		
		int distancia = Math.abs(correcaminos.posicion - posicion);
		double velocidadCoyote = this.obtenerVelocidad();
		
		if( (puedeAtrapar(correcaminos)) && (energia > 0.5 * distancia * velocidadCoyote)) {
			energia -= 0.5 * distancia * velocidadCoyote;
			posicion = correcaminos.posicion;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean comerCorrecaminos (Correcaminos correcaminos) {
		if(correrCorrecaminos(correcaminos)) {
			peso += 12;
			return true;
		}
		return false;
	}
	
	public double obtenerVelocidad() {
		double velocidad;
		velocidad = 5 + (energia/10);
		
		return Math.abs(velocidad);
	}
}
