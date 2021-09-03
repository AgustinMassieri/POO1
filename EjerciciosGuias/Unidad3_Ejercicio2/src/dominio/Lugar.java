package dominio;

public class Lugar {

	private String nombreDelLugar;
	private int distancia;
	
	public Lugar(String nombreDelLugar, int distancia) {
		this.nombreDelLugar = nombreDelLugar;
		this.distancia = distancia;
	}
	
	@Override
	public String toString() {
		return ">> Nombre: " + nombreDelLugar + " - Distancia: " + distancia + "km.\n";
	}
	
	public static int distanciaEntreLugares(Lugar ini, Lugar fin) {
		
		int distancia;
		
		distancia = Math.abs(ini.getDistancia() - fin.getDistancia());
		
		return distancia;
	}
	
	public void setNombre(String nombreDelLugar) {
		this.nombreDelLugar = nombreDelLugar;
	}
	
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public String getNombre() {
		return nombreDelLugar;
	}
	
	public int getDistancia() {
		return distancia;
	}
}
