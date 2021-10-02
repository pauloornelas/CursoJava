package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int quant = 0 ; quant < 10 ; quant++) {
			
			/* Instânciando o objeto aluno */
			Aluno aluno = new Aluno();
			/*----------------------------*/

			aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno " + (quant + 1) + " ?"));
			/*aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Qual a idade do aluno " + aluno.getNome() + " ?")));
			aluno.setDataNascimento(JOptionPane.showInputDialog("Qual a data de nascimento do aluno " + aluno.getNome() + " ?"));
			aluno.setRg(JOptionPane.showInputDialog("Qual o RG do aluno " + aluno.getNome() + " ?"));
			aluno.setCpf(JOptionPane.showInputDialog("Qual é o CPF do aluno " + aluno.getNome() + " ?"));
			aluno.setNomeMae(JOptionPane.showInputDialog("Qual o nome da mãe do aluno " + aluno.getNome() + " ?"));
			aluno.setNomePai(JOptionPane.showInputDialog("Qual o nome do pai do aluno " + aluno.getNome() + " ?"));
			aluno.setDataMatricula(JOptionPane.showInputDialog("Qual foi a data da matrícula do aluno " + aluno.getNome() + " ?"));
			aluno.setNomeEscola(JOptionPane.showInputDialog("Qual o nome da escola do aluno " + aluno.getNome() + " ?"));
			aluno.setSerieMatriculado(JOptionPane.showInputDialog("Em qual serie o aluno " + aluno.getNome() + " está matriculado?"));*/

			for (int pos = 1; pos <= 10; pos++) {
				if(pos > 4) {
					int confirm = JOptionPane.showConfirmDialog(null, "Deseja continuar acrescentando disciplinas?");
					if(confirm != 0) {
						break;
					}else {
						
						/*Instanciando o objeto disciplina*/
						Disciplina disciplina = new Disciplina();
						/*--------------------------------*/
						
						disciplina.setDisciplina(JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?"));
						disciplina.setNota(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina " + disciplina.getDisciplina() + " ?")));
						aluno.getDisciplinas().add(disciplina);
					}
				}else {
					
					/*Instanciando o objeto disciplina*/
					Disciplina disciplina = new Disciplina();
					/*--------------------------------*/
					
					disciplina.setDisciplina(JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?"));
					disciplina.setNota(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da disciplina " + disciplina.getDisciplina() + " ?")));
					aluno.getDisciplinas().add(disciplina);
				}
			}
			
			System.out.println("-----------------------------");
			System.out.println(aluno.getNome());
			for(int cont = 1 ; cont <= aluno.getDisciplinas().size(); cont ++) {
				System.out.println(cont + " - " + (aluno.getDisciplinas().get(cont-1)));
			}
			System.out.println("-----------------------------");
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if(confirm == 0){
				while(confirm == 0 && aluno.getDisciplinas().size() > 0) {
					
					String disciplinaRemov = JOptionPane.showInputDialog("Qual disciplina deseja remover?");
					aluno.getDisciplinas().remove(((Integer.valueOf(disciplinaRemov).intValue())-1));
					System.out.println("-----------------------------");
					System.out.println(aluno.getNome());
					for(int cont = 1 ; cont <= aluno.getDisciplinas().size(); cont ++) {
						System.out.println(cont + " - " + (aluno.getDisciplinas().get(cont-1)));
					}
					System.out.println("-----------------------------");
					if(aluno.getDisciplinas().size() > 0) {
						confirm = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina?");
					}
				}
			}
			
			alunos.add(aluno);
			int continua = JOptionPane.showConfirmDialog(null, "Deseja continuar incluindo alunos?");
			if(continua != 0) {
				break;
			}
			
		}
		
		for(int pos = 0 ; pos < alunos.size() ; pos ++) {
			
			Aluno aluno1 = alunos.get(pos);
			
			System.out.println((pos+1) + " - média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota() + ". " + aluno1.getAlunoAprovado() + ".");
			System.out.println(aluno1);
			System.out.println("----------------------------------------------------------------------");
			
			
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		int continua = JOptionPane.showConfirmDialog(null, "Deseja remover algum aluno ?");
		while(continua == 0 && alunos.size()>0) {
			
			String nomeRemove = JOptionPane.showInputDialog("Qual o nome do aluno a ser removido?");
			for(Aluno aluno : alunos) {
				
				if(aluno.getNome().equalsIgnoreCase(nomeRemove)) {
					int confirmaRemocao = JOptionPane.showConfirmDialog(null, "Deseja realmente remover o aluno " + nomeRemove + " ?");
					if(confirmaRemocao == 0) {
						alunos.remove(aluno);
						for(int pos = 0 ; pos < alunos.size() ; pos ++) {
							
							Aluno aluno1 = alunos.get(pos);
							
							System.out.println((pos+1) + " - média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota() + ". " + aluno1.getAlunoAprovado() + ".");
							System.out.println(aluno1);
							System.out.println("----------------------------------------------------------------------");
							
							
						}
						System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
						break;
					}else {
						break;
					}
				}
				
				
			}
			if(alunos.size()>0) {
				continua = JOptionPane.showConfirmDialog(null, "Deseja remover mais algum aluno ?");
			}
		}
		for(int pos = 0 ; pos < alunos.size() ; pos ++) {
			
			Aluno aluno1 = alunos.get(pos);
			
			System.out.println((pos+1) + " - média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota() + ". " + aluno1.getAlunoAprovado() + ".");
			System.out.println(aluno1);
			System.out.println("----------------------------------------------------------------------");
			
			
		}
		
		
	}

}
