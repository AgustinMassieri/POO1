package programa;

import dominio.Perro;

public class programaAnimal {

	public static void main(String[] args) {
		Perro unPerro = new Perro("Scott","Cocker");
		System.out.println("- Raza: " + unPerro.getRaza() + "\n");
		
		Perro otroPerro = new Perro("Pepe","Golden");
		System.out.println("- Raza: " + otroPerro.getRaza() + "\n");
	}
}
