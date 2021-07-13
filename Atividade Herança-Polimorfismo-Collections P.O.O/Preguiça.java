package Atividades;

public class Pregui�a extends Animal
{
	private String Esp�cie;
    private String Dieta;
    
    public Pregui�a(String Nome, int Idade, String Esp�cies,String Dieta)
    {
    	super(Nome, Idade);
    	this.Esp�cie = Esp�cies;
  	    this.Dieta = Dieta;
    }
    

	public String getEsp�cies() {
		return Esp�cie;
	}

	public void setEsp�cies(String esp�cies) {
		Esp�cie = esp�cies;
	}

	public String getDieta() {
		return Dieta;
	}

	public void setDieta(String dieta) {
		Dieta = dieta;
	}
	
	public void imprimirPregui�a()
	{
		System.out.println("\nNome da pregui�a: "+getNome()+"\n"+"Idade: "+getIdade()
		+"\n"+"esp�cie: "+Esp�cie+"\n"+"tipo de comida: "+Dieta);
	}
	@Override
	public void emitirSom() {
        System.out.println("oooooooiiiiiiiiiiiiiiii.......");
    }

	@Override
    public void capacidade(){
        System.out.println("A pregui�a sobre em �rvores!");
    }
}
