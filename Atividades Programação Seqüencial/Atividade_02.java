package atividades;
/*Faça um sistema que leia a idade de uma pessoa expressa em
dias e mostre-a expressa em anos, meses e dias.*/

import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args)
	{
		double totalDias, anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o total de dias vividos:");
		totalDias = leia.nextFloat();
		
		anos = totalDias/ 365;
		meses =(totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.println("Eu vivi:" +anos+ "anos" +meses+ "meses e" +dias+ "dias de vida...");
				
				

	}

}
