package Atividades;

import java.util.Scanner;

/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

public class Atividade_02 {

	public static void main(String[] args) 
	{
		int a, b ,c;
		
    Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero:");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nOrdem crescente: "+a+", "+b+" e "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente: "+a+", "+c+" e "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nOrdem crescente: "+b+", "+a+" e "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nOrdem crescente: "+b+", "+c+" e "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente: "+c+", "+a+" e "+b);
		}
		else
		{
			System.out.println("\nOrdem crescente: "+c+", "+b+" e "+a);
		}
		
	}




	}


