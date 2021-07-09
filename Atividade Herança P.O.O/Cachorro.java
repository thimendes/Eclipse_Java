package Atividades;

public class Cachorro extends Animal
{
	
	private String Raça;
    private String Cor;
    
    public Cachorro(String Nome,int Idade, String Raça, String Cor)
    {
 	   super(Nome, Idade);
 	   this.Raça = Raça;
 	   this.Cor = Cor;
 		   
    }

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}
   
	
	public void imprimirCachorro()
	{
		System.out.println("\nNome do cachorro: "+getNome()+"\n"+"Idade: "+getIdade()
		+"\n"+"Raça: "+Raça+"\n"+"Cor: "+Cor);
	}

}
