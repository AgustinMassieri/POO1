package programa;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prueba {

	public static void main(String[] args) throws IOException {

		String listaDeLetras[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		FileReader archivoLectura = null;
		
		int caracterLeido;
		
		List<String> listaCaracteresDelArchivo = new ArrayList<>();
		
		try {
		
			archivoLectura = new FileReader("textoGenerado.txt");
			
			caracterLeido = archivoLectura.read();
			
			while( caracterLeido != -1 ) {
				listaCaracteresDelArchivo.add(new String( ("" + (char)caracterLeido + "").toLowerCase() ));
				caracterLeido = archivoLectura.read();
		
			}
			for(String letraAbecedario: listaDeLetras) {
				System.out.println("La letra - " + letraAbecedario + " - se repite " + Collections.frequency(listaCaracteresDelArchivo, letraAbecedario) + " veces.");
			}
			
		}finally {
			
			if(archivoLectura != null)
				archivoLectura.close();
		}
	}

}
