package Atividades;

//Entre com 5 valores e mostre o somatório dos 5 valores lidos.

import java.util.Scanner;

public class atividade_somatorio_for {

	public static void main(String[] args) 
	{
				float valor, x, soma=0;
				
				Scanner leia = new Scanner(System.in);
				
				for(x=1;x<=5;x++)
				{
					System.out.println("\nEntre com um valor: ");
					valor = leia.nextFloat(); 
					
					soma = soma +valor;
				}
				System.out.println("\nSomatório dos valores: "+soma);

		

	}

}
