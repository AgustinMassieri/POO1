package dominio;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	public double getRadio() {
		return radio;
	}
	
	@Override
	public String toString() {
		return "Circulo de radio= " + radio ;
	}
}
