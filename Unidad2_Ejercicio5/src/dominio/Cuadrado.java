package dominio;

public class Cuadrado extends Forma {
	
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {

		double area;
		
		area = lado * lado;
		
		return area;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
}
