package cursojava.executavel;

public class PrimeiraClasseJava {
	
	/*Variavel global acessivel a todos os m�todos*/
	 static int maiorIdadeGlobal = 30;

	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {

		/*Variavel local porque pertence somente a este m�todo */
		int maiorIdade = 18;
		System.out.println("O Valor da variavel local � " + maiorIdade);
		metodo2();

	}
	
	public static void metodo2 () {
		System.out.println("O valor da variavel Global � " + maiorIdadeGlobal);
	}

}
