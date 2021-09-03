package dominio;

public class Lugar {
	
	private String nombre;
	private int distancia;
	
	public Lugar(String nombre, int distancia) {
		this.nombre = nombre;
		this.distancia = distancia;
	}
	
	public int obtenerDistanciaEntreLugares(Lugar lugar1, Lugar lugar2) {
		return Math.abs(lugar1.distancia - lugar2.distancia);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getDistancia() {
		return distancia;
	}
	
	@Override
	public String toString() {
		return "Nombre del lugar: " + nombre + ", Ubicacion: " + distancia + " km.";
	}
}
