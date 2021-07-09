package Atividades;

import java.util.Scanner;

public class atividade_05_do_while {

	public static void main(String[] args) 
	{
		int num, soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		do 
		{
			System.out.println("Digite um valor");
			num= leia.nextInt();
			soma= soma+num;
		}
		while(num!=0);
		
		System.out.println("\nSomas dos numeros:"+soma);
	
	}

}
