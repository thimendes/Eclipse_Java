package Atividades;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
		
import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		double res;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com um n�mero: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0)
		{
			res = Math.sqrt(numero);
		}
		else
		{
			res = Math.pow(numero,2);
		}
		
		System.out.println("\nResultado: "+res);
	}

}

