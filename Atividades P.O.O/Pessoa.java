package Atividades;

/*Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Pessoa 
{
	private String nomeSobrenome;
	private int idade;
	private String dataDeNascimento;
	private String cpf;
	
	public Pessoa (String nome, int idade, String nascimento, String cpf)
	{
		this.nomeSobrenome = nome;
		this.idade = idade;
		this.dataDeNascimento = nascimento;
		this.cpf = cpf;
	}
	public String getInforma��oPessoal()
	{
		String Informa��oPessoal = nomeSobrenome+" tem "+idade+", nasceu no dia "+dataDeNascimento+" e seu cpf � "+cpf;
		return Informa��oPessoal;
	}
}
