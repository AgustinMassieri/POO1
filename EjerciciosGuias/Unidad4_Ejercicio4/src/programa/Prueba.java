package programa;

import dominio.Fecha;
import dominio.ManejadorDeFechas;

public class Prueba {

	public static void main(String[] args) {

		try {
			Fecha unaFecha = new Fecha(1, 2, 3);
			System.out.println("Creo una fecha X: " + unaFecha);
			System.out.println("Fomateo la  fecha X: " + ManejadorDeFechas.fomatearFecha(unaFecha));
			System.out.println("Parseo la fecha que formatie: " + ManejadorDeFechas.parsearFecha("01/02/2000"));
			System.out.println("Cantidad de años: " + ManejadorDeFechas.cantidadDeAnios(unaFecha));
		}catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

}
