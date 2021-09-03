package programa;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import dominio.Bebida;
import dominio.BebidaNombreComparator;

public class Prueba {

	public static void main(String[] args) {

		String [] marcas = {"Coca-Cola","Pepsi","Campari","Patagonia"};
		
		SortedSet<Bebida> setDeBebidas = new TreeSet<>();
		Set<Bebida> otroSetDeBebidas = new TreeSet<>(new BebidaNombreComparator());
		
		
		System.out.println(">> Armo el setDeBebidas.\n");
		for( String marca: marcas) {
			setDeBebidas.add(new Bebida(marca));
		}
		
		System.out.println(">> Imprimo el setDeBebidas: \n");
		for(Bebida bebida : setDeBebidas) {
			System.out.println(bebida.toString());
		}
		
		System.out.println("\n>> Armo el otroSetDeBebidas.\n");
		for( String marca: marcas) {
			otroSetDeBebidas.add(new Bebida(marca));
		}
		
		System.out.println(">> Imprimo el otroSetDeBebidas: \n");
		for(Bebida bebida : otroSetDeBebidas) {
			System.out.println(bebida.toString());
		}
	}

}
