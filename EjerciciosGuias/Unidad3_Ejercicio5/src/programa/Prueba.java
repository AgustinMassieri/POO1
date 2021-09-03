package programa;

import dominio.Alpiste;
import dominio.Ave;
import dominio.Pez;
import dominio.Postre;

public class Prueba {

	public static void main(String[] args) {

		Ave piopio = new Ave("Piopio");
		System.out.println(piopio.toString());
		Pez nemo = new Pez(4);
		Postre postrecito = new Postre();
		Alpiste alpiste = new Alpiste(12);
		
		piopio.comer(nemo);
		piopio.comer(postrecito);
		piopio.comer(alpiste);
		piopio.volar(20);
	}

}
