package dominio;

public class Rectangulo extends Figura{

	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo de base= " + base + " y altura= " + altura ;
	}
}
