package dominio;

public class Rectangulo extends Forma {

	private double altura;
	private double base;
	
	public Rectangulo(double altura, double base) {
		this.base= base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		
		double area;
		
		area = base * altura;
		
		return area;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getBase() {
		return base;
	}
}
