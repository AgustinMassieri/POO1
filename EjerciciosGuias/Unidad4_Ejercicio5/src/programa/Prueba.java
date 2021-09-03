package programa;

import dominio.Alimento;
import dominio.VerificadorVencimiento;

public class Prueba {

	public static void main(String[] args) {

		try {
			Alimento unAlimento = new Alimento("Alfajor", -2);
			VerificadorVencimiento.todaviaSirve(unAlimento);
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
