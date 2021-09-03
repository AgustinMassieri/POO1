package dominio;

public class Alimento {

	private String nombre;
	int cantidadDeDiasHastaVencimiento;
	
	public Alimento(String nombre, int cantidadDeDiasHastaVencimiento) {
		this.nombre = nombre;
		this.cantidadDeDiasHastaVencimiento = cantidadDeDiasHastaVencimiento;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCantidadDeDiasHastaVencimiento(int cantidadDeDiasHastaVencimiento) {
		this.cantidadDeDiasHastaVencimiento = cantidadDeDiasHastaVencimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCantidadDeDiasHastaVencimiento() {
		return cantidadDeDiasHastaVencimiento;
	}
}
