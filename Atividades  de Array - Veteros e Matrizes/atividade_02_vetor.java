package Atividades;

import java.util.Scanner;

/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/

public class atividade_02_vetor {

	public static void main(String[] args) 
	{
		
		int [] numero = new int[6];
		int x, somadospares=0, cont=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) 
		{
			System.out.println("Entre com um numero: ");
			numero[x] = leia.nextInt();
			
			
		}
		for(x=0;x<6;x++) 
		{
			if(numero[x] % 2 == 0) 
			{
				System.out.println("\n"+numero[x]+" é par...");
				
				somadospares=somadospares + numero[x];
				
			}
			else 
			{
				cont++;
				System.out.println("\n"+numero[x]+" é impar...");
				
			}
		}
		System.out.println("\nA soma dos números pares digitados: "+somadospares);
		System.out.println("\nA quantidade de números ímpares digitados: "+cont);
		

	}

}
