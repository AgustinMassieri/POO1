package programa;

import dominio.Circulo;
import dominio.Cuadrado;
import dominio.Rectangulo;
import dominio.Triangulo;

public class CalculoAreas {

	public static void main(String[] args) {

		Rectangulo unRectangulo = new Rectangulo(2,4);
		Circulo unCirculo = new Circulo(4);
		Cuadrado unCuadrado = new Cuadrado(5);
		Triangulo unTriangulo = new Triangulo(2, 4);
		
		System.out.println(">> Area del Rectangulo: " + unRectangulo.calcularArea());
		System.out.println(">> Area del Circulo: " + unCirculo.calcularArea());
		System.out.println(">> Area del Cuadrado: " + unCuadrado.calcularArea());
		System.out.println(">> Area del Triangulo: " + unTriangulo.calcularArea());

	}

}
