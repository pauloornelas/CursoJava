package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		String stringNota1 = JOptionPane.showInputDialog(null, "Informe a nota 1.");
		String stringNota2 = JOptionPane.showInputDialog(null, "Informe a nota 2.");
		String stringNota3 = JOptionPane.showInputDialog(null, "Informe a nota 3.");
		String stringNota4 = JOptionPane.showInputDialog(null, "Informe a nota 4.");

		double nota1 = Double.parseDouble(stringNota1);
		double nota2 = Double.parseDouble(stringNota2);
		double nota3 = Double.parseDouble(stringNota3);
		double nota4 = Double.parseDouble(stringNota4);
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com média " + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média " + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com média " + media);
		}

	}

}
