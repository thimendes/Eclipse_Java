package Atividades;

public abstract class Animal 

{
	private String Nome;
	private int Idade;
	
	
	public Animal(String Nome,int Idade)
	{
		super();
		this.Nome = Nome;
		this.Idade = Idade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = Nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int Idade) {
		this.Idade = Idade;
	}
	public abstract void emitirSom();

    public abstract void capacidade();
}
