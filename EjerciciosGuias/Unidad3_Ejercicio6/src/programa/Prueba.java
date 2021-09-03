package programa;

import dominio.Canasta;
import dominio.Lobo;
import dominio.Lugar;
import dominio.Manzana;
import dominio.Persona;

public class Prueba {

	public static void main(String[] args) {

		Lugar cueva = new Lugar("Cueva", 0);
		System.out.println(cueva.toString());
		Lugar bosque = new Lugar("Bosque", 10);
		System.out.println(bosque.toString());
		Lugar casaAbuela = new Lugar("Casa de la Abuela", 15);
		System.out.println(casaAbuela.toString());
		
		Lobo lobo = new Lobo(100, cueva);
		System.out.println(lobo.toString());
		
		Manzana manzana = new Manzana();
		
		Canasta canasta1 = new Canasta(10);
		System.out.println(canasta1.toString());
		
		Persona caperucita = new Persona("Caperucita", 75, canasta1); 
		System.out.println(caperucita.toString());
		Persona abuela = new Persona("Abuelita", 0 , canasta1);
		System.out.println(abuela.toString());
		
		System.out.println("\n-> Mando al Lobo de la cueva al bosque: ");
		lobo.correrLugar(bosque);
		
		System.out.println("\n-> Se encuentra a Caperucita y esta le tira una manzana");
		caperucita.tirarManzana(lobo, manzana);
		System.out.println("Grasa del Lobo actual: " + lobo.getGrasa());
		
		System.out.println("\n-> Mando al Lobo a la casa de la Abuelita");
		lobo.correrLugar(casaAbuela);
		
		System.out.println("\n-> El Lobo se come a la Abuelita");
		lobo.comerPersona(abuela);

		System.out.println("\n-> Luego de comerse a la Abuelita, llega Caperucita, le hace una serie de preguntas pero el Lobo tambien se la come...");
		lobo.comerPersona(caperucita);
		
		System.out.println("\n-> Luego de toda la historia el estado del Lobo es: " + lobo.getEstado());
	}

}
