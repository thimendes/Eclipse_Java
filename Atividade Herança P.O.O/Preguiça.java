package Atividades;

public class Preguiça extends Animal
{
	private String Espécie;
    private String Dieta;
    
    public Preguiça(String Nome, int Idade, String Espécies,String Dieta)
    {
    	super(Nome, Idade);
    	this.Espécie = Espécies;
  	    this.Dieta = Dieta;
    }
    

	public String getEspécies() {
		return Espécie;
	}

	public void setEspécies(String espécies) {
		Espécie = espécies;
	}

	public String getDieta() {
		return Dieta;
	}

	public void setDieta(String dieta) {
		Dieta = dieta;
	}
	
	public void imprimirPreguiça()
	{
		System.out.println("\nNome da preguiça: "+getNome()+"\n"+"Idade: "+getIdade()
		+"\n"+"espécie: "+Espécie+"\n"+"tipo de comida: "+Dieta);
	}
	@Override
	public void emitirSom() {
        System.out.println("oooooooiiiiiiiiiiiiiiii.......");
    }

	@Override
    public void capacidade(){
        System.out.println("A preguiça sobre em árvores!");
    }
}
