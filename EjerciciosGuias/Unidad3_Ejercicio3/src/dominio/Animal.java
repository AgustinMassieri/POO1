package dominio;

public abstract class Animal {

	protected int peso;
	protected int energia;
	protected int posicion;
	
	public abstract double obtenerVelocidad();
	
	public Animal(int peso, int posicion, int energia) {
		this.peso = peso;
		this.posicion = posicion;
		this.energia = energia;

	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public int getEnergia() {
		return energia;
	}
	
	public int getPosicion() {
		return posicion;
	}
}
