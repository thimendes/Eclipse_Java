package atividades;

/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno.
Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.*/

import java.util.Scanner;

public class Atividade_05 {

	public static void main(String[] args) 
	{
		float n1, n2, n3, total;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota:");
		n1 = leia.nextFloat();
		
		System.out.println("\nEntre com a segunda nota:");
		n2 = leia.nextFloat();
		
		System.out.println("\nEntre com a terceira nota:");
		n3 = leia.nextFloat();
		
		total = (n1*2 + n2*3 + n3*5)/(2+3+5);
		System.out.println("M�dia total: "+ total);
		

	}

}
