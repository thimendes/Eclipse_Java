package Atividades;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

public class Atividade_01 {

	public static void main(String[] args) 
	{
		int n1, n2, n3, maiorPontuacao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		n3 = leia.nextInt();
		
		
		  if (n1 > n2)
		    {
		        if(n1 > n3)
		        {
		        	System.out.printf("O maior numero �: %d\n", n1);
		        }
		        else
		        {
		        	System.out.printf("O maior numero �: %d\n", n3);
		        }
		    }
		    else
		    {
		        if(n2 > n3)
		        {
		        	System.out.printf("O maior numero �: %d\n", n2);
		        }
		        else
		        {
		        	System.out.printf("O maior numero �: %d\n", n3);
		        }
		    }
		
			

		    
		    
		
		

	}

}
