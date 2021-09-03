package programa;

public class HolaMundoRunnable implements Runnable{

	public void run() {
		Thread.currentThread().yield();
		System.out.println("Hola Mundo Runnable");
	}	
	
}