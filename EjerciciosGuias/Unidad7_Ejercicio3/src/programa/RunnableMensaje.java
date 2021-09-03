package programa;

public class RunnableMensaje implements Runnable {

	public void run() {
		
		int i = 0;
		
		for( i = 0; i < 5 ; i++ ) {
			
			System.out.println(Thread.currentThread().getName());
			
			try {
				
				Thread.sleep(1000);
				
			}catch(InterruptedException exception) {
				
				System.out.println(exception);
			}
		}
	}
}
