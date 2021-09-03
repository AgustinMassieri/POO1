package programa;

import dominio.Circulo;

public class Prueba {
	
	public static void main(String[] args) {

		try {
			Circulo unCirculo = new Circulo(10);;
			System.out.println(unCirculo.calcularArea(0));
		}catch(Exception exception) {
			exception.printStackTrace();
			//System.out.println(exception.getMessage());
		}
	}
}
