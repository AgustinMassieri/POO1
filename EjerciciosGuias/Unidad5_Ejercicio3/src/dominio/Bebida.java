package dominio;

public class Bebida implements Comparable<Bebida>{

	private String marca;
	
	public int compareTo(Bebida bebidaComparacion) {
		int comparacion = 0;
		
		comparacion = this.marca.compareTo(bebidaComparacion.getMarca());
				
		return comparacion;
	}
	
	public Bebida(String marca) {
		this.marca = marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bebida other = (Bebida) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Bebida --> Marca: " + marca;
	}
}
