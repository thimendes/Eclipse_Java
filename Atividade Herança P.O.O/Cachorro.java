package Atividades;

public class Cachorro extends Animal
{
	
	private String Ra�a;
    private String Cor;
    
    public Cachorro(String Nome,int Idade, String Ra�a, String Cor)
    {
 	   super(Nome, Idade);
 	   this.Ra�a = Ra�a;
 	   this.Cor = Cor;
 		   
    }

	public String getRa�a() {
		return Ra�a;
	}

	public void setRa�a(String ra�a) {
		Ra�a = ra�a;
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
		+"\n"+"Ra�a: "+Ra�a+"\n"+"Cor: "+Cor);
	}

}
