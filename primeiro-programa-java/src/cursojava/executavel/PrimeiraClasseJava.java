package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		double nota1 = 90;
		double nota2 = 10;
		double nota3 = 30;
		double nota4 = 20;

		double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Condições lógicas com IF e ELSE */
		if (mediaNota >= 70) {
			System.out.println("Aluno aprovado " + mediaNota);
		} else if (mediaNota >= 40) {
			System.out.println("Aluno de recuperação " + mediaNota);
		} else {
			System.out.println("Aluno reprovado " + mediaNota);
		}

		/* Operações ternárias são para micro validações */
		String saidaResultado = mediaNota >= 70 ? "Aluno aprovado" : mediaNota >= 40 ? "Aluno de recuperação" : "Aluno reprovado";
		
		System.out.println(saidaResultado + " " + mediaNota);
	}

}
