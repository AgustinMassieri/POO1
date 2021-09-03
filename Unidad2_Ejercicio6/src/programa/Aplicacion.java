package programa;

import dominio.Persona;

public class Aplicacion {

	public static void main(String[] args) {

		Persona unaPersona = new Persona("Agustin", "Massieri");
		Persona otraPersona = new Persona("Roberto","Alvarez");
		
		System.out.println(unaPersona.toString());
		System.out.println(otraPersona.toString());
	}

}
