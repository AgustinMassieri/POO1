package dominio;

public class MetodosExtras {

	public static String modificacionLetra(String raza) {
		
		String razaModificada = "";
		
		String listaPalabraRaza[] = raza.split(" ");
		
		int cantidadDePalabras = listaPalabraRaza.length;
		
		int i;
		String aux;
		int largoPalabraAux;
		
		for(i = 0; i < cantidadDePalabras ; i++ ) {
			aux = listaPalabraRaza[i];
			largoPalabraAux = aux.length();
			aux = aux.substring(0,1).toUpperCase() + aux.substring(1,largoPalabraAux);
			listaPalabraRaza[i] = aux;
		}

		i = 0;
		razaModificada = listaPalabraRaza[i];
		i++;
		
		while ( i < cantidadDePalabras ) {
			razaModificada = razaModificada + " " + listaPalabraRaza[i];
			i++;
		}
		
		return razaModificada;
	}
}
