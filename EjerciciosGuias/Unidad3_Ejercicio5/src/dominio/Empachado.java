package dominio;

public class Empachado extends Estado{
	
	@Override
	public String toString() {
		return "Empachado";
	}
	
	public boolean estaActivo(){
		return true;
	}
	
	public boolean noEstaActivo(){
		return false;
	}
}
