package programa;

import dominio.Lobo;
import dominio.Persona;

public class Prueba {

	public static void main (String[] args ) {
		
		Lobo unLobo = new Lobo(205);
		Persona unaPersona = new Persona(85);
		
		System.out.println(unLobo);
		System.out.println(unaPersona);
		
		unLobo.comerPersona(unaPersona);
		
		unLobo.correr(5);
		
	}

	

}
