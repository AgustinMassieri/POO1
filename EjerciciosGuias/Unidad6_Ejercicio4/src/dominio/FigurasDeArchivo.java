package dominio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FigurasDeArchivo {

	public static Figura crearFiguraDeArchivo(String nombreArchivo) throws NoHayMasFigurasException, IOException {
		
		
		Figura figuraDelArchivo = null;
		
		ObjectInputStream archivoDeLectura = null;
		
		try {
			
			archivoDeLectura = new ObjectInputStream(new FileInputStream(nombreArchivo));
			figuraDelArchivo = (Figura) archivoDeLectura.readObject();
			
		}catch(ClassNotFoundException exception) {
			
			throw new NoHayMasFigurasException();
			
		}finally {
			
			if( archivoDeLectura != null ) {
				archivoDeLectura.close();
			}
			
		}
		
		return figuraDelArchivo;
		
	}
}
