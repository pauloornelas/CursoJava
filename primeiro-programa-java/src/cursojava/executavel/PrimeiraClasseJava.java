package cursojava.executavel;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		double nota1 = 90;
		double nota2 = 90;
		double nota3 = 90;
		double nota4 = 20;

		double mediaNota = (nota1 + nota2 + nota3 + nota4) / 4;

		if (mediaNota >= 70) {
			System.out.println("Aluno aprovado " + mediaNota);
		} else if (mediaNota > 40) {
			System.out.println("Aluno de recuperação " + mediaNota);
		} else {
			System.out.println("Aluno reprovado " + mediaNota);
		}

	}

}
