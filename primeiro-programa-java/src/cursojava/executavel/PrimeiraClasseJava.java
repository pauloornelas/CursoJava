package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* Main � um m�todo auto execut�vel em Java */
	public static void main(String[] args) {

		/* new Aluno() = Inst�ncia ou cria��o do objeto */
		/* aluno1 = � uma refer�ncia ao objeto aluno */
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();

		aluno1.setNome(JOptionPane.showInputDialog("Qual o nome do aluno 1?"));
		aluno1.setIdade((int) Double.parseDouble(JOptionPane.showInputDialog("Qual a idade do aluno 1?")));
		aluno1.setDataNascimento(JOptionPane.showInputDialog("Qual a data de nascimento do aluno 1?"));
		aluno1.setRg(JOptionPane.showInputDialog("Qual o RG do aluno 1?"));
		aluno1.setCpf(JOptionPane.showInputDialog("Qual � o CPF do aluno 1?"));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Qual o nome da m�e do aluno 1?"));
		aluno1.setNomePai(JOptionPane.showInputDialog("Qual o nome do pai do aluno 1?"));
		aluno1.setDataMatricula(JOptionPane.showInputDialog("Qual foi a data da matr�cula do aluno 1?"));
		aluno1.setNomeEscola(JOptionPane.showInputDialog("Qual o nome da escola do aluno 1?"));
		aluno1.setSerieMatriculado(JOptionPane.showInputDialog("Em qual serie o aluno 1 est� matriculado?"));

		aluno1.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 1?")));
		aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 2?")));
		aluno1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 3?")));
		aluno1.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 4?")));

		JOptionPane.showMessageDialog(null, "A m�dia do aluno 1 � " + aluno1.getMediaNota());

		System.out.println("O nome do aluno 1 � " + aluno1.getNome());
		System.out.println("A idade do aluno 1 � " + aluno1.getIdade());
		System.out.println("O CPF do aluno 1 � " + aluno1.getCpf());

	}

}
