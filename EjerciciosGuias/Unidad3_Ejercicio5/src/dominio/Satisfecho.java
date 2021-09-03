package dominio;

public class Satisfecho extends Estado {
	
	@Override
	public String toString() {
		return "Satisfecho";
	}
	
	public boolean estaActivo(){
		return true;
	}
	
	public boolean noEstaActivo(){
		return false;
	}
}
