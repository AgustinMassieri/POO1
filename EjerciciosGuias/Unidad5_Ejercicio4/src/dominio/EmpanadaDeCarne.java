package dominio;

public class EmpanadaDeCarne extends Empanada{

	public EmpanadaDeCarne() {
	
		precio = 20;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "Empanada de Carne.";
	}
	
	public void aplicarDescuento() {
		precio = precio * 0.75;
	}
}
