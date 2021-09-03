package dominio;

public class Empleado {

	private int legajo;
	private String nombre;
	private String apellido;
	private int telefono;
	
	public Empleado(int legajo, String nombre, String apellido, int telefono) {
		
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono =  telefono;
	}
	
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	public int getLegajo() {
		return legajo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public int getTelefono() {
		return telefono;
	}
}
