package Atividades;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

public class atividade_02_for {

	public static void main(String[] args) 
	{
		int x, num, par=0, impar=0;
		
		Scanner leia = new Scanner (System.in);
		
		for(x=1;x<=10;x++)
		{
			System.out.println("\nEntre com um valor: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) 
			{
				num= par++;
			}
			
			else 
			{
				num= impar++;
			}
			
		}
		System.out.println("\nSão "+par+" Pares");
		System.out.println("\nSão "+impar+" Impares");
	

	}

}
