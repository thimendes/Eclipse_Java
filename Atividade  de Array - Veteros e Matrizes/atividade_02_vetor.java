package Atividades;

import java.util.Scanner;

/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/

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
				System.out.println("\n"+numero[x]+" � par...");
				
				somadospares=somadospares + numero[x];
				
			}
			else 
			{
				cont++;
				System.out.println("\n"+numero[x]+" � impar...");
				
			}
		}
		System.out.println("\nA soma dos n�meros pares digitados: "+somadospares);
		System.out.println("\nA quantidade de n�meros �mpares digitados: "+cont);
		

	}

}
