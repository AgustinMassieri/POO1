package dominio;

public class VerificadorVencimiento {

	public static void	todaviaSirve(Alimento unAlimento) throws AlimentoEnMalEstadoException{
		
		if(unAlimento.getCantidadDeDiasHastaVencimiento() <= 0) {
			throw new AlimentoEnMalEstadoException();
		}
	}
}
