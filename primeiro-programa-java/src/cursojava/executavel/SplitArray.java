package cursojava.executavel;

import java.util.Arrays;
import java.util.List;


public class SplitArray {
	
	public static void main(String[] args) {
		
		String texto = "Paulo, Java, 80, 90, 70, 60";
		
		String[] conversao = texto.split(", ");
		
		System.out.println("Nome :" + conversao[0]);
		System.out.println("Curso :" + conversao[1]);
		System.out.println("Nota 1 :" + conversao[2]);
		System.out.println("Nota 2 :" + conversao[3]);
		System.out.println("Nota 3 :" + conversao[4]);
		System.out.println("Nota 4 :" + conversao[5]);
		
		
		/*Convertendo um Array para uma Lista*/		
		List<String> list = Arrays.asList(conversao);
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		for(int posi = 0; posi < list.size() ; posi++) {
			System.out.println("Posição " + posi + " da lista : " + list.get(posi));
		}
		
		String[] convertArray = list.toArray(new String[6]);
		for(String pos : convertArray) {
			System.out.println(pos);
		}
	}

}
