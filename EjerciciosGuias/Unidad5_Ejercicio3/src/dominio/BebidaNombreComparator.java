package dominio;

import java.util.Comparator;

public class BebidaNombreComparator implements Comparator<Bebida>{
	
	public int compare(Bebida bebidaUno, Bebida bebidaDos) {
		int comparacion;
		
		comparacion = -(bebidaUno.compareTo(bebidaDos)); //Con un "-" hago que sea de mayor a menor
		
		return comparacion;
	}
	
}