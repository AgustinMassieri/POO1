package dominio;

public class Lobo {
	
	private double grasa;
	private EstadoDeSalud estado;
	private Lugar lugar;

	public Lobo(double grasa, Lugar lugar) {
		
		setGrasa(grasa);
		this.lugar = lugar;
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
	
	public double getGrasa() {
		
		return grasa;
	}
	
	public EstadoDeSalud getEstado() {
		
		return estado;
	}
	
	public void comerPersona(Persona persona) {
		
		double pesoPersona = persona.getPeso();
		double grasaNueva = pesoPersona / 10; 
		setGrasa(grasa + grasaNueva);
		System.out.println("Se comio a " + persona.getNombre() + " y su grasa actual es: " + grasa);
	}
	
	public void correrTiempo(double minutos) {
		
		double grasaNueva = 2 * minutos;
		
		setGrasa(grasa - grasaNueva);
		
		System.out.println("Corrio durantes " + minutos + " mins y su grasa actual es: " + grasa);
	}
	
	public void correrLugar(Lugar lugarDestino) {
		
		double grasaNueva = 2 * lugar.obtenerDistanciaEntreLugares(lugar, lugarDestino);
		
		setGrasa(grasa - grasaNueva);
		
		System.out.println("Corrio hasta " + lugarDestino.getNombre() + " y su grasa actual es: " + grasa);
	}
	
	public void comerManzana(Manzana manzana) {
		setGrasa(grasa + manzana.cantidadDeCalorias());
		System.out.println("El lobo dice que se comio la manzana!");
	}
	
	@Override
	public String toString() {
		return ">> Soy un lobo de: " + lugar.getNombre() + " y mi estado es: " + estado;
	}
	

}
