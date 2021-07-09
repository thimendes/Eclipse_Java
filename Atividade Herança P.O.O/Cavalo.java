package Atividades;

public class Cavalo extends Animal
{
	private String Peço;
    private String Altura;
    
    public Cavalo(String Nome,int Idade, String Peço, String Altura) 
    {
    	super(Nome, Idade);
    	this.Peço = Peço;
  	    this.Altura = Altura;
    }

	public String getPeço() {
		return Peço;
	}

	public void setPeço(String peço) {
		Peço = peço;
	}

	public String getAltura() {
		return Altura;
	}

	public void setAltura(String altura) {
		Altura = altura;
	}
    
	public void imprimirCavalo()
	{
		System.out.println("\nNome do cavalo: "+getNome()+"\n"+"Idade: "+getIdade()
		+"\n"+"Peço: "+Peço+"\n"+"Altura: "+Altura);
	}
}
