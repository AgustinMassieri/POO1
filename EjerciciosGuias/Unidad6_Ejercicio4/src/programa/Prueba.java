package programa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import dominio.Circulo;
import dominio.FigurasDeArchivo;
import dominio.NoHayMasFigurasException;
import dominio.Rectangulo;
import dominio.Triangulo;

public class Prueba {

	public static void main(String[] args) throws IOException {

		Circulo unCirculo = new Circulo(5);
		Triangulo unTriangulo = new Triangulo(12.3, 5);
		Rectangulo unRectangulo = new Rectangulo(10.1, 9.9);
		
		ObjectOutputStream archivoDeCirculo = null;
		ObjectOutputStream archivoDeTriangulo = null;
		ObjectOutputStream archivoDeRectangulo = null;
		
		try {
		archivoDeCirculo =  new ObjectOutputStream(new FileOutputStream("circulo.fig"));
		archivoDeTriangulo =  new ObjectOutputStream(new FileOutputStream("triangulo.fig"));
		archivoDeRectangulo =  new ObjectOutputStream(new FileOutputStream("rectangulo.fig"));

		archivoDeCirculo.writeObject(unCirculo);
		archivoDeTriangulo.writeObject(unTriangulo);
		archivoDeRectangulo.writeObject(unRectangulo);
		
		}finally {
			
			if( (archivoDeCirculo != null) && (archivoDeTriangulo != null) && (archivoDeRectangulo != null) ) {
				archivoDeCirculo.close();
				archivoDeRectangulo.close();
				archivoDeTriangulo.close();
			}
		}
		
		try {
			
			System.out.println(FigurasDeArchivo.crearFiguraDeArchivo("triangulo.fig"));
			System.out.println(FigurasDeArchivo.crearFiguraDeArchivo("rectangulo.fig"));
			System.out.println(FigurasDeArchivo.crearFiguraDeArchivo("circulo.fig"));

			
			
		}catch(NoHayMasFigurasException exception) {
			
			System.out.println(exception.getMessage());
		}
		
		
	}

}
