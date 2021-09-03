package programa;

import dominio.Correcaminos;
import dominio.Coyote;

public class Prueba {

	public static void main(String[] args) {

		Correcaminos unCorrecaminos = new Correcaminos(20, 0, 500);
		Coyote unCoyote = new Coyote(100, 2, 100);
		
		System.out.println("\n--- Creo a el Coyote y al Correcaminos. ---");

		System.out.println(unCorrecaminos.toString());
		System.out.println(unCoyote.toString());
		
		
		System.out.println("\n--- Hago que el Coyote corra al Correcaminos. ---");
		if(unCoyote.correrCorrecaminos(unCorrecaminos) == true) {
			System.out.println("El coyote corrio al correcaminos y se encuentra en la posicion: " + unCoyote.getPosicion() + " y tiene energia = " + unCoyote.getEnergia() + ".");
		}
		else {
			System.out.println("No pudo correr al correcaminos por falta de energia.");
		}
		
		
	}

}
