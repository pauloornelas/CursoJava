package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Thread rodando");

		while (true) {
			

			synchronized (pilha_fila) { /* Bloquear o acesso a esta lista por outro processo */
				
				Iterator iteracao = pilha_fila.iterator();

				while (iteracao.hasNext()) {

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					System.out.println("Processando dados " + processar);

					iteracao.remove();

					try {
						Thread.sleep(1000); /* Dar um tempo para a descarga da mem�ria */
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

			try {
				Thread.sleep(1000); /* ao finalizar a lista dar um tempo para a limpesa de mem�ria */
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
