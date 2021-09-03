package dominio;

public abstract class Animal {

	private String nombre;
	
	public Animal (String nombre) {
		System.out.println("- Su nombre es: " + nombre);
	}
}
