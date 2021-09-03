package programa;

import dominio.Ave;
import dominio.Lugar;

public class Prueba {

	public static void main(String[] args) {

		System.out.println("--- Creo el registro de lugares ---");
		
		Lugar lugarUno = new Lugar("Buenos Aires", 0);
		System.out.println(lugarUno.toString());
		Lugar lugarDos = new Lugar("Chascomús", 122);
		System.out.println(lugarDos.toString());
		Lugar lugarTres = new Lugar("Lezama", 156);
		System.out.println(lugarTres.toString());
		Lugar lugarCuatro = new Lugar("Dolores", 210);
		System.out.println(lugarCuatro.toString());
		Lugar lugarCinco = new Lugar("Las Armas", 300);
		System.out.println(lugarCinco.toString());
		Lugar lugarSeis = new Lugar("Mar Del Plata", 400);
		System.out.println(lugarSeis.toString());
		
		System.out.println("\n--- Creo a Piopio ---");
		
		Ave piopio = new Ave("Piopio", lugarUno);
		System.out.println(piopio.toString());
		
		System.out.println("\n--- Lo hago volar y comer ---");
		
		System.out.println(piopio.volarAlLugar(lugarDos));
		System.out.println(piopio.comer(200));
		System.out.println(piopio.volarAlLugar(lugarDos));

		System.out.println(piopio.getEnergia());
	}

}
