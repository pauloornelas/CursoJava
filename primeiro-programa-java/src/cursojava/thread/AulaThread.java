package cursojava.thread;


public class AulaThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*Cria os objetos das Threads*/
		Thread envioEmail = new Thread(thread1);
		Thread imprimeNota = new Thread(thread2);
		
		
		/*Starta os objetos das Threads*/
		imprimeNota.start();
		envioEmail.start();
		
		System.out.println("Fim do código!!!");
		
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			for(int i = 0 ; i < 10 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Envia e-mail!!!");
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {

			for(int i = 0 ; i < 10 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Imprime no nota!!!");
			}
			
		}
	};

}
