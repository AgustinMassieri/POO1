package dominio;

import java.util.Calendar;

public class ManejadorDeFechas {

	public static String fomatearFecha(Fecha unaFecha) {
		
		String fechaFormatoString;
		String diaFormatoString;
		String mesFormatoString;
		String anioFormatoString;
		
		if( unaFecha.dia < 10 ) {
			diaFormatoString = "0" + Integer.toString(unaFecha.dia);
		}else {
			diaFormatoString = Integer.toString(unaFecha.dia);
		}
		
		if( unaFecha.mes < 10 ) {
			mesFormatoString = "0" + Integer.toString(unaFecha.mes);
		}else {
			mesFormatoString = Integer.toString(unaFecha.mes);
		}
				
		if( unaFecha.anio < 10 ) {
			anioFormatoString = "000" + Integer.toString(unaFecha.anio);
		}else if(unaFecha.anio < 100) {
			anioFormatoString = "00" + Integer.toString(unaFecha.anio);
		}else if(unaFecha.anio < 1000) {
			anioFormatoString = "0" + Integer.toString(unaFecha.anio);
		}else {
			anioFormatoString = Integer.toString(unaFecha.anio);
		}
		
		fechaFormatoString = diaFormatoString + "/" + mesFormatoString + "/" + anioFormatoString;
		
		return fechaFormatoString;
	}
	
	public static Fecha parsearFecha(String unaFecha) throws Exception{
		
		Fecha fecha;
		String[] partesDeLaFecha = unaFecha.split("/");
		int dia;
		int mes;
		int anio;
		
		dia = Integer.parseInt(partesDeLaFecha[0]);
		mes = Integer.parseInt(partesDeLaFecha[1]);
		anio = Integer.parseInt(partesDeLaFecha[2]);
		
		fecha = new Fecha(dia, mes, anio);
		return fecha;
	}
	
	public static int cantidadDeAnios(Fecha unaFecha) {
		int añoActual = Calendar.getInstance().get(Calendar.YEAR);
		
		int cantidadDeAños = añoActual - unaFecha.anio;
		
		return cantidadDeAños;
	}
	
	
}
