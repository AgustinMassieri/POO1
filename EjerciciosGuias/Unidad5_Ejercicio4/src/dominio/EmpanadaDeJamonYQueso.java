package dominio;

public class EmpanadaDeJamonYQueso extends Empanada {


	public EmpanadaDeJamonYQueso() {
	
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
