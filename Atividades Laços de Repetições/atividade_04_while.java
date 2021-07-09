package Atividades;

import java.util.Scanner;

public class atividade_04_while {

	public static void main(String[] args) {
		int idade, identGenero,fatorpsicologico,x=1;
		int contpc=0, contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nEntre com sua identidade de genero -- 1-Femenino  2-Masculino  3-Outros : ");
			identGenero = leia.nextInt();
			System.out.println("\nEntre com o fator psicológico -- 1-Calma  2-Nervosa  3-Agressiva");
			fatorpsicologico = leia.nextInt();
			
			if(fatorpsicologico == 1)
			{
				contpc++;
			}
			if(identGenero==1 && fatorpsicologico==2)
			{
				contmn++;
			}
			if(identGenero==2 && fatorpsicologico==3)
			{
				contha++;
			}
			if(identGenero==3 && fatorpsicologico==1)
			{
				contoc++;	
			}
			if(fatorpsicologico==2 && idade>40)
			{
				contpn40++;
			}
			if(fatorpsicologico==1 && idade<18)
			{
				contpc18++;
			}
			
			x++;
		}
		
		System.out.println("\nPessoas calmas: "+contpc);
		System.out.println("\nMulheres nervosas: "+contmn);
		System.out.println("\nHomens agressivos: "+contha);
		System.out.println("\nOutros calmas: "+contoc);
		System.out.println("\nPessoas nervosas acima de 40 anos: "+contpn40);
		System.out.println("\nPessoas calmas com menos de 18 anos: "+contpc18);

		
				

	}

}
