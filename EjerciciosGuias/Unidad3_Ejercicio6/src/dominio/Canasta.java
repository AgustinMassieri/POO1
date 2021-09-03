package dominio;

public class Canasta {

	private int cantidadDeManzanas;
	
	public Canasta(int cantidadDeManzanas) {
		this.cantidadDeManzanas = cantidadDeManzanas;
	}
	
	public void setCantidadDeManzanas(int cantidadDeManzanas) {
		this.cantidadDeManzanas = cantidadDeManzanas;
	}
	
	public int getCantidadDeManzanas() {
		return cantidadDeManzanas;
	}
	
	public void sacarManzana() {
		this.cantidadDeManzanas = cantidadDeManzanas - 1;
	}
	
	@Override
	public String toString() {
		return "Canasta de: " + cantidadDeManzanas + " manzanas.";
	}
}
