package dominio;

public class Perro extends Animal{

	
	private String raza;

	public Perro(String nombreDelAnimal, String razaDelPerro){
		super(nombreDelAnimal);
		this.raza = MetodosExtras.modificacionLetra(razaDelPerro);
	}
	
	public Perro() {
		this("","callejero");
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = MetodosExtras.modificacionLetra(raza);
	}
		
	@Override
	public String toString() {
		
		return "Raza: " + raza;
	}
}

