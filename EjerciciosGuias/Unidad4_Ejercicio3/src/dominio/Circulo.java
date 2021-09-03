package dominio;

public class Circulo {
	
	private double radio;
	
	public Circulo() {
		this.radio = 1;
	}
	
	public Circulo(double radio) {
		
		setRadio(radio);
	}
	
	
	public double getRadio() {
		return radio;
	}
	
	public  void setRadio(double radio) throws IllegalArgumentException{
		if ( radio <= 0 ) {
			throw new IllegalArgumentException();
		}
		else {
			this.radio = radio;
		}
	}
	
	public double calcularArea(double radio) throws IllegalStateException{
		
		double area;
		
		if ( radio == 0) {
			throw new IllegalStateException();
		}
		else {
			area = Math.PI * Math.pow(radio, 2);
		}
		
		return area;
	}

}
