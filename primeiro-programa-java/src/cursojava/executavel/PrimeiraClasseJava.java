package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Variavel global acessivel a todos os métodos*/
	 static int maiorIdadeGlobal = 30;

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		/*Variavel local porque pertence somente a este método */
		int maiorIdade = 18;
		System.out.println("O Valor da variavel local é " + maiorIdade);
		metodo2();

	}
	
	public static void metodo2 () {
		System.out.println("O valor da variavel Global é " + maiorIdadeGlobal);
	}

}
