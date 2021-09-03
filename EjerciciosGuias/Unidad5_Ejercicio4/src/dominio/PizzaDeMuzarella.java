package dominio;

public class PizzaDeMuzarella extends Pizza {

	public PizzaDeMuzarella() {
	
		precio = 250;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	@Override
	public String toString() {
		return "Pizza de Muzzarella.";
	}
	
	public void aplicarDescuento() {
		precio = precio * 0.75;
	}
}
