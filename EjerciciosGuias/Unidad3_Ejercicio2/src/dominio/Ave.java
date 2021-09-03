package dominio;

public class Ave {

	private double energia;
	private String nombre;
	private Lugar lugarInicial;
	
	public Ave (String nombre, Lugar lugarInicial) {
		energia = 100;
		this.nombre = nombre;
		this.lugarInicial = lugarInicial;
	}
	
	@Override
	public String toString() {

		return "** Nombre: " + nombre + " - Energia: " + energia + " J.";
	}
	
	public boolean volar(int distancia) {
		
		if (energia > distancia + 10 ) {
			
			energia = energia - distancia - 10;
			return true;
		}
		return false;
	}
	
	public boolean puedeVolarAlLugar(Lugar lugar) {
		
		int distancia = Lugar.distanciaEntreLugares(lugarInicial, lugar);
		
		if ( energia > distancia + 10) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String volarAlLugar(Lugar lugar) {
		
		if (puedeVolarAlLugar(lugar)) {
			volar(Lugar.distanciaEntreLugares(lugarInicial, lugar));
			lugarInicial = lugar;
			return "Volo correctamente hasta: " + lugar.getNombre();
		}
		
		return "No pudo volar ya que necesita más energia.";
	}
	public String comer(double gramosAComer) {
		energia += gramosAComer * 4;
		return "Comio " + gramosAComer + " gr.";
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return "Nombre: " + nombre;
	}
	
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	
	public String getEnergia() {
		return "Energia: " + energia + " J.";
	}
}
