package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		int quantPos = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas você irá informar?"));
		
		double[] notas = new double[quantPos];
		
		for(int pos = 0 ; pos < notas.length ; pos++) {
			notas[pos] = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota " + (pos+1) + " ?"));
		}
		
		for(int pos = 0 ; pos < notas.length ; pos++) {
			System.out.println("Nota " + (pos+1) + ": " + notas[pos]);
		}
		
		 
	}

}
