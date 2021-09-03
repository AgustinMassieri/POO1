package programa;

import dominio.Calculadora;

public class Prueba {

	public static void main(String[] args) {
		
		try {
			System.out.println("Resultado: " + Calculadora.dividir(70, 0));
			
		}catch(Exception excpetion) {
			
			System.out.println(excpetion.getMessage());
		}
	}

}
