package programa;

import dominio.Ave;

public class Prueba {

	public static void main(String[] args) {
		
		Ave ave1 = new Ave("Ave 1");
		Ave ave2 = new Ave("Ave 2");
		
		System.out.println(ave1.toString());
		System.out.println(ave2.toString());
		
		System.out.println("\n");
		
		System.out.println(ave1.volar(10));
		System.out.println("Energia actual: " + ave1.getEnergia());
		
		System.out.println(ave2.comer(10));
		System.out.println("Energia actual: " + ave2.getEnergia());
	}

}
