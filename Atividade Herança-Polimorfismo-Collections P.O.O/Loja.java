package Atividades;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/

import java.util.ArrayList;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) 
	{
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n(1) Armazenar Smartphone\n"
					+ "(2) Retirar um Smartphone? \n(3) Atualizar Smartphone\n(4) Mostrar todos os Smartphones do estoque"
					+ "\n(0) Encerrar o programa");
			
			System.out.println("\nDigite sua opção: ");
			
			op = leia.nextInt();
			switch(op)
			
			{case 1:
				leia.nextLine();
				System.out.println("\nDigite o Smartphone para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o Smartphone para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				}
				else
				{
					System.out.println("\nSmartphone não existe no estoque...");
				}
				System.out.println(estoque);
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o Smartphone que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+" : ");
				String novo = leia.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existente...");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("\nPrograma Finalizado!!!...");
				
			}
			
		}
		while(op!=0);
		}

	}


