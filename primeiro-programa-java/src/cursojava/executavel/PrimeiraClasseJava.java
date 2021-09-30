package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* Main é um método auto executável em Java */
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros.");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas.");

		double numCarros = Double.parseDouble(carros);
		double numPessoas = Double.parseDouble(pessoas);

		int divisao = (int) (numCarros / numPessoas);

		int resto = (int) (numCarros % numPessoas);
		String texto;
		
		int confirm = JOptionPane.showConfirmDialog(null, "Deseja ver quantos carros deram por pessoa?");
		if (confirm == 0) {
			if (divisao > 1) {
				texto = "Ficaram " + divisao + " carros por pessoa.";
			} else {
				texto = "Ficou " + divisao + " carro por pessoa.";
			}
			JOptionPane.showMessageDialog(null, texto);
		}
		
		confirm = JOptionPane.showConfirmDialog(null, "Deseja ver quantos carros sobraram?");
		if (confirm == 0) {
			if (resto > 1) {
				texto = "Sobraram " + resto + " carros.";
			} else {
				texto = "Sobrou " + resto + " carro.";
			}
			JOptionPane.showMessageDialog(null, texto);
		}
	}

}
