package dominio;

public class Circulo extends Forma {

	private double radio;
	
	public Circulo (double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
	
		double area;
		
		area = Math.PI * Math.pow(radio,2);
		
		return area;
	}
	
	public void setRadio (double radio) {
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}
	

}
