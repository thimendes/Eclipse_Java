package Atividades;
//Entre com um valor para mostrar a tabuada deste valor.

import java.util.Scanner;

public class atividade_tabuada_do_while {

	public static void main(String[] args) {
    int tabuada,res,x=1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor da tabuada: ");
		tabuada = leia.nextInt();//5
		for(int y=1;y<=15;y++)
		{
		System.out.println("\n");
		}
		do
		{
			res = tabuada * x;
			System.out.println("\n"+tabuada+" X "+x+" = "+res);
			x++;
		}
		while(x<=10);
		


	}

}
