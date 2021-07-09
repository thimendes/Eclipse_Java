package Atividades;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

import java.util.Scanner;

public class atividae_03_while {

	public static void main(String[] args) 
	{
		int  idade, idadeGeral=0,contidadeMaior=0, contidadeMenor =0;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		while(idade!= -99)
		{
			System.out.println("\nDigite sua idade: ");
			idade = leia.nextInt();
		
		if(idade<21)
		{
			contidadeMenor ++;
		}
		else if(idade>50)
		{
			contidadeMaior ++;
		}
		else
		{
			idadeGeral ++;
		}
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+contidadeMenor);
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+contidadeMaior);

	}

}
