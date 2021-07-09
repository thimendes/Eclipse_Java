package atividades;
/*Faça um sistema que leia a idade de uma pessoa expressa em anos, 
meses e dias e mostre-a expressa apenas em dias.*/

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) 
	{
		double d, m, a;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva sua idade em dias:");
		d = leia.nextFloat();
		
		System.out.println("\nEscreva sua idade em meses:");
		m = leia.nextFloat();
		
		System.out.println("\nEscreva sua idade em anos:");
		a = leia.nextFloat();
		
		System.out.println("Sua idade em dias é:"+d+(m*30)+(a*365));

	}

}
