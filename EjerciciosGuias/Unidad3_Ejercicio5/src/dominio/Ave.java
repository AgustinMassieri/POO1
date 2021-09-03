package dominio;

public class Ave {
	
	private double energia;
	private String nombre;
	private Estado satisfecho;
	private Estado empachado;
	
	public Ave (String nombre) {
		this.nombre = nombre;
		setEnergia(100);
	}
	
	@Override
	public String toString() {
		return ">> Soy un Ave con Energia = " + energia + " J y me llamo: " + nombre + ".";
	}
	
	public void setEnergia(double energia) {
		this.energia = energia;
		
		if( energia > 100 ) {
			this.empachado = new Empachado();
		}
		
		else if ( (energia > 50) && (energia < 100) ) {
			this.satisfecho = new Satisfecho();
		}
	}
	
	public double getEnergia() {
		return energia;
	}
	
	public boolean tieneHambre() {
		if(satisfecho.noEstaActivo() && empachado.noEstaActivo()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void volar(int distancia) {
		setEnergia(energia - distancia - 10);
		System.out.println("	Voló " + distancia + " km y su energia ahora es de: " + energia+ " J.");
	}
	
	public void comer(Alimento alimento) {
		setEnergia(energia + alimento.darAporteEnergetico());
		System.out.println("	Se comio el alimento y su energia ahora es de: " + energia + " J.");
	}
}
