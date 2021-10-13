package cursojava.thread;


public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
			public void run() {
				
				/*Aqui dentro se executa a rotina em paralelo*/
				
				for(int i = 0 ; i < 10 ; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Imprime no console!!!");
				}
				
			};
			
		}.start();
		
		System.out.println("Fim do código!!!");
		
	}

}
