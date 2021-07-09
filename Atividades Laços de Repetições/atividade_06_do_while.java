package Atividades;
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

import java.util.Scanner;

public class atividade_06_do_while {

	public static void main(String[] args) 
	{
		int media=0, num=0, multiplo=0, soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		do
		{ 
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
			if(num % 3 ==0)
			{
				soma=soma+num;
				multiplo++;
			}
			
		}
		while(num!=0);
		
		media=soma/multiplo;
		
		System.out.println("A média dos numeros digitados multiplos de 3 é: " +media);
		System.out.println("Quantidades de numeros multiplos é: " +media);
		

	}

}
