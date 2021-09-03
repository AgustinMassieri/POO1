package programa;

import java.util.HashSet;
import java.util.Set;

import dominio.Bebida;

public class Prueba {

	public static void main(String[] args) {

		String[] marcas = {"Patagonia","Quilmes","Coca-Cola","Pepsi"};
		
		Set<Bebida> setDeBebidas = new HashSet<>();
		
		for( String marca: marcas) {
			setDeBebidas.add(new Bebida(marca));
		}
		
		System.out.println("\nImprimo el set de Bebidas generadas: ");
		for(Bebida bebida:setDeBebidas) {
			System.out.println(">> Bebida marca: " + bebida.getMarca());
		}
		
		System.out.println("\nAgrego una Bebida repetida al set!");
		Bebida bebidaDePrueba = new Bebida("Patagonia");
		setDeBebidas.add(bebidaDePrueba);
		
		System.out.println("\nImprimo el set de Bebidas generadas verificando que no me haya agregado la repetida: ");
		for(Bebida bebida:setDeBebidas) {
			System.out.println(">> Bebida marca: " + bebida.getMarca());
		}
	}

}
