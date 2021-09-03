package dominio;

public class Lobo {
	
	private double grasa;
	private EstadoDeSalud estado;

	public Lobo(double grasa) {
		setGrasa(grasa);
	}
	
	private void setGrasa(double grasa) {
		
		this.grasa = grasa;
		
		if( grasa > 200 ) {
			estado = new Gordo(); 
		}
		else {
			estado = new Saludable();
		}
	}
	
	public EstadoDeSalud getEstado() {
		return estado;
	}
	
	public double getGrasa() {
		return grasa;
	}
	
	public void mostrarEstado(EstadoDeSalud estado){
		System.out.println("Estado: " + estado );
	}
	
	public void comerPersona(Persona persona) {
		double pesoPersona = persona.getPeso();
		double grasaNueva = pesoPersona / 10; 
		setGrasa(grasa + grasaNueva);
		System.out.println("Se comio a la persona y su grasa actual es: " + grasa);
	}
	
	public void correr(double minutos) {
		
		double grasaNueva = 2 * minutos;
		
		setGrasa(grasa - grasaNueva);
		
		System.out.println("Corrio durantes " + minutos + " mins y su grasa actual es: " + grasa);
	}
	
	@Override
	public String toString() {
		return ">> Lobo con grasa = " + grasa + ", y Estado: " + estado;
	}
}
