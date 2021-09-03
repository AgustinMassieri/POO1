package programa;

import dominio.Perro;

public class Aplicacion {

	public static void main(String[] args) {

		Perro unPerro = new Perro("Scott", "Cocker");
		Perro otroPerro = new Perro();
		
		System.out.println(unPerro.toString());
		System.out.println(otroPerro.toString());
	}

}
