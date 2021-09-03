package programa;

public class RunnableIncrementor implements Runnable {

	public void run() {
		int contador = 0;
		
		while(true) {
			
			System.out.println(contador);
			contador++;
			
			
			if(Thread.interrupted()) {
				return;
			}
		}
	}
}
