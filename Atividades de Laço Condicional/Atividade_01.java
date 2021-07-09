package Atividades;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.

public class Atividade_01 {

	public static void main(String[] args) 
	{
		int n1, n2, n3, maiorPontuacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número:");
		n3 = leia.nextInt();
		
		
		  if (n1 > n2)
		    {
		        if(n1 > n3)
		        {
		        	System.out.printf("O maior numero é: %d\n", n1);
		        }
		        else
		        {
		        	System.out.printf("O maior numero é: %d\n", n3);
		        }
		    }
		    else
		    {
		        if(n2 > n3)
		        {
		        	System.out.printf("O maior numero é: %d\n", n2);
		        }
		        else
		        {
		        	System.out.printf("O maior numero é: %d\n", n3);
		        }
		    }
		
			

		    
		    
		
		

	}

}
