package programa;

public class HolaMundoThread extends Thread{
	
	public void run() {
		Thread.currentThread().yield();
		System.out.println("Hola Mundo Thread");
	}
	
}
