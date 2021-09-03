package dominio;

public class Prueba {

	public static void main(String[] args) {

		Thread threadConHerencia = new HolaMundoThread();
		Thread threadConRunnanble = new Thread(new HolaMundoRunnable());
		
		threadConHerencia.start();
		threadConRunnanble.start();
	
		System.out.println("Fin del main");
	}

}
