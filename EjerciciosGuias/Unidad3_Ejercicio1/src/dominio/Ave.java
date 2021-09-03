package dominio;

public class Ave {

	private double energia;
	private String nombre;
	
	public Ave (String nombre) {
		energia = 100;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {

		return ">> Nombre: " + nombre + " - Energia: " + energia;
	}
	
	public String volar(int distancia) {
		
		if (energia > distancia + 10 ) {
			
			energia = energia - distancia - 10;
			return "Pudo volar los " + distancia + " km.";
		}
		return "No pudo volar los " + distancia + " km por falta de energia.";
	}
	
	public String comer(double gramosAComer) {
		energia += gramosAComer * 4;
		return "Comio " + gramosAComer + " gr.";
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	
	public double getEnergia() {
		return energia;
	}
	
}
