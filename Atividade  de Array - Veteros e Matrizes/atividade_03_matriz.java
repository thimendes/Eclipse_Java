package Atividades;

import java.util.Scanner;

//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

public class atividade_03_matriz {

	public static void main(String[] args) 
	{
		float [][] valor = new float [3][3];
		int linha, coluna,contagem=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) 
		{
			for(coluna=0;coluna<3;coluna++) 
			{
				System.out.println("Digite um numero ");
				valor[linha][coluna] = leia.nextFloat();
			}
		}
		for(linha=0;linha<3;linha++) 
		{
			for(coluna=0;coluna<3;coluna++) 
			{
				if(valor[linha][coluna]>10)
				{
					contagem++;
				}
			}
		}
		System.out.println("\nQuantos valores maiores que 10 possui "+contagem);
		
		

	}

}
