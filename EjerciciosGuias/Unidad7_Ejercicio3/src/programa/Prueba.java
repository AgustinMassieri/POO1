package programa;

public class Prueba {

	public static void main(String[] args) {
		
		Thread threadMensaje1 = new Thread(new RunnableMensaje(), "Thread 1");
		Thread threadMensaje2 = new Thread(new RunnableMensaje(), "Thread 2");

		threadMensaje1.start();
		threadMensaje2.start();
		
		try {
			threadMensaje1.join();
			threadMensaje2.join();
		}catch(InterruptedException exception) {
			System.out.println(exception);
		}
		
		System.out.println("Fin del main");
	}

}
