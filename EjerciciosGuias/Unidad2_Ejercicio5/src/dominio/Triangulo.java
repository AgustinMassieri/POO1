package dominio;

public class Triangulo extends Forma {

	double base;
	double altura;
	
	public Triangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		
		double area;
		
		area = (base * altura) / 2;
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
