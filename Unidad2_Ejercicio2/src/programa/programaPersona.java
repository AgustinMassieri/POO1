package programa;

import dominio.Persona;

public class programaPersona {

	public static void main(String[] args) {

		Persona persona = new Persona("Agustín", 20);
		Persona otraPersona = new Persona("Agustin", "11/04/2000");
	
		System.out.println("Prueba Constructor 1 --> " + persona.toString());
		System.out.println("Prueba Constructor 2 --> " +otraPersona.toString());
	
	}

}
