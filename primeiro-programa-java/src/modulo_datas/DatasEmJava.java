package modulo_datas;

import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		Date data = new Date();
		
		System.out.println("Data em milisegundos: " + data.getTime());
		System.out.println("Dia do mês: " + data.getDate());
		System.out.println("Dia da semana: " + data.getDay());
		System.out.println("Horas do dia: " + data.getHours());
		System.out.println("Minutos da hora: " + data.getMinutes());
		System.out.println("Segundos dos minutos: " + data.getSeconds());
		System.out.println("Ano : " + (data.getYear()+1900));
	}
}
