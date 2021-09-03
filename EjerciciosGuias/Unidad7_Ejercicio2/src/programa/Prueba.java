package programa;

public class Prueba {

	public static void main(String[] args) {
		
		Thread threadConHerencia = new HolaMundoThread();
		Thread threadConRunnable = new Thread(new HolaMundoRunnable());
		
		threadConHerencia.start();
		threadConRunnable.start();
		System.out.println("Fin de Main");
	}

}
