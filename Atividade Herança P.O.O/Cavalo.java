package Atividades;

public class Cavalo extends Animal
{
	private String Pe�o;
    private String Altura;
    
    public Cavalo(String Nome,int Idade, String Pe�o, String Altura) 
    {
    	super(Nome, Idade);
    	this.Pe�o = Pe�o;
  	    this.Altura = Altura;
    }

	public String getPe�o() {
		return Pe�o;
	}

	public void setPe�o(String pe�o) {
		Pe�o = pe�o;
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
		+"\n"+"Pe�o: "+Pe�o+"\n"+"Altura: "+Altura);
	}
}
