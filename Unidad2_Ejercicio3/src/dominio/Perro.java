package dominio;

public class Perro extends Animal{

	private String raza;
	
	public Perro(String nombre, String razaDelPerro){
		
		super(nombre);
		this.raza = razaDelPerro;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public String getRaza() {
		return raza;
	}
	
}

