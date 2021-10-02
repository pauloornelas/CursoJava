package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		/* Intânciando o objeto aluno */
		Aluno aluno1 = new Aluno();
		/*----------------------------*/

		aluno1.setNome(JOptionPane.showInputDialog("Qual o nome do aluno 1?"));
		aluno1.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Qual a idade do aluno " + aluno1.getNome() + " ?")));
		aluno1.setDataNascimento(JOptionPane.showInputDialog("Qual a data de nascimento do aluno " + aluno1.getNome() + " ?"));
		aluno1.setRg(JOptionPane.showInputDialog("Qual o RG do aluno " + aluno1.getNome() + " ?"));
		aluno1.setCpf(JOptionPane.showInputDialog("Qual é o CPF do aluno " + aluno1.getNome() + " ?"));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Qual o nome da mãe do aluno " + aluno1.getNome() + " ?"));
		aluno1.setNomePai(JOptionPane.showInputDialog("Qual o nome do pai do aluno " + aluno1.getNome() + " ?"));
		aluno1.setDataMatricula(JOptionPane.showInputDialog("Qual foi a data da matrícula do aluno " + aluno1.getNome() + " ?"));
		aluno1.setNomeEscola(JOptionPane.showInputDialog("Qual o nome da escola do aluno " + aluno1.getNome() + " ?"));
		aluno1.setSerieMatriculado(JOptionPane.showInputDialog("Em qual serie o aluno " + aluno1.getNome() + " está matriculado?"));

		for (int pos = 1; pos <= 10; pos++) {
			if(pos > 4) {
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar acrescentando disciplinas?");
				if(confirm != 0) {
					break;
				}else {
					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?"));
					disciplina.setNota(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina " + disciplina.getDisciplina() + " ?")));
					aluno1.getDisciplinas().add(disciplina);
				}
			}else {
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?"));
				disciplina.setNota(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina " + disciplina.getDisciplina() + " ?")));
				aluno1.getDisciplinas().add(disciplina);
			}
		}

		System.out.println("A média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota() + ", o aluno está " + aluno1.getAlunoAprovado() + ".");
		System.out.println(aluno1);

	}

}
