package Atividades;

public class Testa_Fornecedor {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean direcao = true;
		
		Fornecedor thiagopedroso = new Fornecedor("Thiago Pedroso","Rua Mauricio Jacquey,321","12345678912",974543322,18,10000,1000);
		Fornecedor leticiamaria = new Fornecedor("Let�cia Maria","Rua das Hort�ncias,58","1234567891",81124550,19,15000,5);
		
		thiagopedroso.imprimirInfo();
		System.out.println("\n");
		thiagopedroso.validarCpf();
		System.out.println("\n");
		thiagopedroso.obterSaldo();
		
		System.out.println("\n");
		System.out.println("\n");
		leticiamaria.imprimirInfo();
		System.out.println("\n");
		leticiamaria.validarCpf();
		System.out.println("\n");
		leticiamaria.obterSaldo();
		
		if(direcao == false)
		{
			System.out.println("\nParab�ns May, voc� est� na dire��o certa...");
		}
		else
		{
			System.out.println("\nCuidado May, voc� n�o pode perder a dire��o...");
		}

	}

}
