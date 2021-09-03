package dominio;

public class ParseadorDeFecha {

	public static String parsearFecha(String fecha) throws FormatoInvalidoDeFecha{
		
		String[] partesDeLaFecha = fecha.split("/");
		int dia;
		int mes;
		int anio;
		
		dia = Integer.parseInt(partesDeLaFecha[0]);
		mes = Integer.parseInt(partesDeLaFecha[1]);
		anio = Integer.parseInt(partesDeLaFecha[2]);
		
		if ( esFecha(dia,mes,anio) ) {
			return "Es valida";
		}
		else {
			throw new FormatoInvalidoDeFecha();
		}

	}
	
	private static boolean esFecha(int dia, int mes, int anio) {
		
		if( esDiaValido(dia) && esMesValido(mes) && esAnioValido(anio) ) {
		
			if ( mes == 2) {
				if ( !esAnioBisiesto(anio) && (dia > 28)) {
					return false;
				}
				if ( esAnioBisiesto(anio) && (dia >29) ) {
					return false;
				}
			}
			
			else if ( !(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia == 31) ) {
				return false;
			}
			
			return true;
		}
		return false;
	}
	
	private static boolean esAnioBisiesto(int anio) {
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			return true;
		}
		return false;
	}
	
	private static boolean esDiaValido(int dia) {
		
		if( (dia > 0) && (dia <= 31) ) {
			return true;
		}
		
		return false;
	}
	
	private static boolean esMesValido(int mes) {
		
		if( (mes > 0) && (mes <= 12) ) {
			return true;
		}
		
		return false;
	}
	
	private static boolean esAnioValido(int anio) {
		
		if (anio >= 0) {
			return true;
		}
		
		return false;
	}
}
