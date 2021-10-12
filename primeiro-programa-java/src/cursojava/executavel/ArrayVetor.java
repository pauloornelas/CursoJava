package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		int quantDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Quantas disciplinas você irá informar?"));
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		for(int pos = 0 ; pos < quantDisciplinas ; pos++) {
			
			Disciplina disciplina = new Disciplina();
			double[] notas = new double[disciplina.getNotas().length];
			
			disciplina.setDisciplina(JOptionPane.showInputDialog("Qual o nome da disciplina " + (pos+1) + " ?"));
			
			for(int posi = 0 ; posi < notas.length ; posi++) {
				notas[posi] = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota " + (posi+1) + " ?"));
			}
			
			disciplina.setNotas(notas);
			disciplinas.add(disciplina);
		}
		
		System.out.println("----------------Disciplinas----------------");
		for(int posi = 0 ; posi < disciplinas.size() ; posi++) {
			
			double maiorNota=0.0;
			System.out.println("++++++++++++++++++++++++++++++++++++++");
			
			Disciplina dis = disciplinas.get(posi);
			
			System.out.println((posi+1) + " - " + dis.getDisciplina());
			for(int pos = 0 ; pos < dis.getNotas().length ; pos++) {
				System.out.println("Nota " + pos + ": " + (dis.getNotas()[pos]));
				if( maiorNota < dis.getNotas()[pos] ) {
					maiorNota = dis.getNotas()[pos];
				}
			}
			System.out.println("A maior nota na disciplina foi : " + maiorNota);
		}
		 
	}

}
