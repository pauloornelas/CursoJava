package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.TelasEscola.CadastroNewAluno;
import cursojava.TelasEscola.TelaInicialEscola;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* Instanciando as listas de objetos */
	private static List<Aluno> alunos = new ArrayList<Aluno>();
	
	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		
		String login = JOptionPane.showInputDialog("Qual o login de acesso?");
		String senha = JOptionPane.showInputDialog("Qual a senha?");

		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

			TelaInicialEscola telaInicialEscola = new TelaInicialEscola();
			try {

				/* Instancia um map de listas do tipo "Aluno" */
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				for (int quant = 0; quant < 10; quant++) {

					/* Instânciando o objeto aluno */
					Aluno aluno = new Aluno();
					/*----------------------------*/

					/*aluno.setNome(JOptionPane.showInputDialog("Qual o nome do aluno " + (quant + 1) + " ?"));
					aluno.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Qual a idade do aluno " + aluno.getNome() + " ?")));
					aluno.setDataNascimento(JOptionPane.showInputDialog("Qual a data de nascimento do aluno " + aluno.getNome() + " ?"));
					aluno.setRg(JOptionPane.showInputDialog("Qual o RG do aluno " + aluno.getNome() + " ?"));
					aluno.setCpf(JOptionPane.showInputDialog("Qual é o CPF do aluno " + aluno.getNome() + " ?"));
					aluno.setNomeMae(JOptionPane.showInputDialog("Qual o nome da mãe do aluno " + aluno.getNome() + " ?"));
					aluno.setNomePai(JOptionPane.showInputDialog("Qual o nome do pai do aluno " + aluno.getNome() + " ?"));
					aluno.setDataMatricula(JOptionPane.showInputDialog("Qual foi a data da matrícula do aluno " + aluno.getNome() + " ?"));
					aluno.setNomeEscola(JOptionPane.showInputDialog("Qual o nome da escola do aluno " + aluno.getNome() + " ?"));
					aluno.setSerieMatriculado(JOptionPane.showInputDialog("Em qual serie o aluno " + aluno.getNome() + " está matriculado?"));*/

					for (int pos = 1; pos <= 10; pos++) {
						if (pos > 4) {
							int confirm = JOptionPane.showConfirmDialog(null,"Deseja continuar acrescentando disciplinas?");
							if (confirm != 0) {
								break;
							} else {

								/* Instanciando o objeto disciplina */
								Disciplina disciplina = new Disciplina();
								/*--------------------------------*/

								disciplina.setDisciplina(JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?"));
								double[] notas = new double[disciplina.getNotas().length];
								for(int posi = 0 ; posi < disciplina.getNotas().length ; posi++) {
									notas[posi] = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota " + (posi+1) + " da disciplina " + disciplina.getDisciplina() + " ?"));
								}
								disciplina.setNotas(notas);
								aluno.getDisciplinas().add(disciplina);
							}
						} else {

							/* Instanciando o objeto disciplina */
							Disciplina disciplina = new Disciplina();
							/*--------------------------------*/

							disciplina.setDisciplina(JOptionPane.showInputDialog("Qual o nome da disciplina " + pos + " ?"));
							double[] notas = new double[disciplina.getNotas().length];
							for(int posi = 0 ; posi < disciplina.getNotas().length ; posi++) {
								notas[posi] = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota " + (posi+1) + " da disciplina " + disciplina.getDisciplina() + " ?"));
							}
							disciplina.setNotas(notas);
							aluno.getDisciplinas().add(disciplina);
						}
					}

					System.out.println("-----------------------------");
					System.out.println(aluno.getNome());
					for (int cont = 1; cont <= aluno.getDisciplinas().size(); cont++) {

						System.out.println(cont + " - " + (aluno.getDisciplinas().get(cont - 1)));
					}
					System.out.println("-----------------------------");
					int confirm = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
					if (confirm == 0) {
						while (confirm == 0 && aluno.getDisciplinas().size() > 0) {

							String disciplinaRemov = JOptionPane.showInputDialog("Qual disciplina deseja remover?");
							aluno.getDisciplinas().remove(((Integer.valueOf(disciplinaRemov).intValue()) - 1));
							System.out.println("-----------------------------");
							System.out.println(aluno.getNome());
							for (int cont = 1; cont <= aluno.getDisciplinas().size(); cont++) {

								System.out.println(cont + " - " + (aluno.getDisciplinas().get(cont - 1)));
							}
							System.out.println("-----------------------------");
							if (aluno.getDisciplinas().size() > 0) {
								confirm = JOptionPane.showConfirmDialog(null, "Deseja remover mais alguma disciplina?");
							}
						}
					}
					alunos.add(aluno);
					int continua = JOptionPane.showConfirmDialog(null, "Deseja continuar incluindo alunos?");
					if (continua != 0) {
						break;
					}
				}

				for (int pos = 0; pos < alunos.size(); pos++) {

					Aluno aluno1 = alunos.get(pos);
					System.out.println((pos + 1) + " - média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota()+ ". " + aluno1.getAlunoAprovado() + ".");
					System.out.println(aluno1);
					System.out.println("----------------------------------------------------------------------");
				}
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				int continua = JOptionPane.showConfirmDialog(null, "Deseja remover algum aluno ?");
				while (continua == 0 && alunos.size() > 0) {

					String nomeRemove = JOptionPane.showInputDialog("Qual o nome do aluno a ser removido?");
					for (Aluno aluno : alunos) {

						if (aluno.getNome().equalsIgnoreCase(nomeRemove)) {
							int confirmaRemocao = JOptionPane.showConfirmDialog(null,"Deseja realmente remover o aluno " + nomeRemove + " ?");
							if (confirmaRemocao == 0) {

								alunos.remove(aluno);
								for (int pos = 0; pos < alunos.size(); pos++) {

									Aluno aluno1 = alunos.get(pos);
									System.out.println((pos + 1) + " - média do aluno " + aluno1.getNome() + " é "+ aluno1.getMediaNota() + ". " + aluno1.getAlunoAprovado() + ".");
									System.out.println(aluno1);
									System.out.println("----------------------------------------------------------------------");
								}
								System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
								break;
							} else {
								break;
							}
						}
					}
					if (alunos.size() > 0) {
						continua = JOptionPane.showConfirmDialog(null, "Deseja remover mais algum aluno ?");
					}
				}

				/*
				 * Separa para os alunos para suas respectivas listas: APROVADO, RECUPERACAO e
				 * REPROVADO
				 */
				for (Aluno aluno1 : alunos) {
					if (aluno1.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
						maps.get(StatusAluno.APROVADO).add(aluno1);
					} else if (aluno1.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno1);
					} else if (aluno1.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
						maps.get(StatusAluno.REPROVADO).add(aluno1);
					}
				}
				/*-----------------------------------------------------------------------------------*/

				if (maps.get(StatusAluno.APROVADO).size() > 0) {
					System.out.println("++++++++++++++++Alunos aprovados++++++++++++++++");
					for (int pos = 0; pos < maps.get(StatusAluno.APROVADO).size(); pos++) {
						Aluno aluno1 = maps.get(StatusAluno.APROVADO).get(pos);
						System.out.println((pos + 1) + " - média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota() + ".");
						System.out.println(aluno1);
						System.out.println("----------------------------------------------------------------------");
					}
				}
				if (maps.get(StatusAluno.RECUPERACAO).size() > 0) {
					System.out.println("+++++++++++++Alunos em Recuperação+++++++++++++");
					for (int pos = 0; pos < maps.get(StatusAluno.RECUPERACAO).size(); pos++) {
						Aluno aluno1 = maps.get(StatusAluno.RECUPERACAO).get(pos);
						System.out.println((pos + 1) + " - média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota() + ".");
						System.out.println(aluno1);
						System.out.println("----------------------------------------------------------------------");
					}
				}
				if (maps.get(StatusAluno.REPROVADO).size() > 0) {
					System.out.println("+++++++++++++++Alunos reprovados+++++++++++++++");
					for (int pos = 0; pos < maps.get(StatusAluno.REPROVADO).size(); pos++) {
						Aluno aluno1 = maps.get(StatusAluno.REPROVADO).get(pos);
						System.out.println((pos + 1) + " - média do aluno " + aluno1.getNome() + " é " + aluno1.getMediaNota() + ".");
						System.out.println(aluno1);
						System.out.println("----------------------------------------------------------------------");
					}
				}
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
				
			}catch (NullPointerException e) {
				
				StringBuilder saida = new StringBuilder();
				for(int i = 0 ; i <= e.getStackTrace().length ; i++) {
					saida.append("\nClasse de erro : " + e.getStackTrace()[i].getClassName());
					saida.append("\nMetodo de erro : " + e.getStackTrace()[i].getMethodName());
					saida.append("\nLinha de erro : " + e.getStackTrace()[i].getLineNumber());
					saida.append("\nClasse de erro : " + e.getClass().getName());
				}
			}

		}else {
			JOptionPane.showMessageDialog(null, "Acesso negado, login ou senha incorreto!");
		}
	}
	
	public void addAlunoLista(Aluno aluno) {
		alunos.add(aluno);
		for(Aluno aluno1 : alunos) {
			System.out.println(aluno1.getNome());
		}
	}
}
