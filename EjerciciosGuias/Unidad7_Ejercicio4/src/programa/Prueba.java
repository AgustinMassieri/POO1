package programa;

public class Prueba {

	public static void main(String[] args) {
		
		Thread threadIncrementor = new Thread(new RunnableIncrementor());

		threadIncrementor.start();
		
		try {
			Thread.sleep(500);
			threadIncrementor.interrupt();
		}catch(InterruptedException exception) {
			System.out.println(exception);
		}
		
		System.out.println("Fin del main.");
	}

}
