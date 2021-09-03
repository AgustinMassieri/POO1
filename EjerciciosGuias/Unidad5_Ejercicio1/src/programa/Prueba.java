package programa;

import java.util.ArrayList;
import java.util.List;

import dominio.Bebida;

public class Prueba {

	public static void main(String[] args) {

		String[] marcas = {"Patagonia","Quilmes","Coca-Cola","Pepsi"};
		
		List<Bebida> listaDeBebidas = new ArrayList<>();
		
		for(String marca: marcas) {
			listaDeBebidas.add(new Bebida(marca));
		}
		
		System.out.println("\nImprimo la lista de Bebidas generadas: ");
		for(Bebida bebida: listaDeBebidas) {
			System.out.println(">> Bebida marca: " + bebida.getMarca());
		}
		
		Bebida bebidaParaRemoverDeLaLista = new Bebida("Quilmes");
		listaDeBebidas.remove(bebidaParaRemoverDeLaLista);

		System.out.println("\nElimine una Bebida de la lista: ");
		for(Bebida bebida: listaDeBebidas) {
			System.out.println(">> Bebida marca: " + bebida.getMarca());
		}
	}

}
