package programa;

import dominio.ParseadorDeFecha;

public class Prueba {

	public static void main(String[] args) {

		String fecha = "12/5/144";
		
		try {
			System.out.println(ParseadorDeFecha.parsearFecha(fecha));
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
