package Atividades;

public class Teste_Animal {

	public static void main(String[] args) 
	{
		Cachorro Fofo = new Cachorro("Fofo ",1,"D�lmata","Branco com pintas brancas");
		Fofo.imprimirCachorro();
		Fofo.emitirSom();
        Fofo.capacidade();
		System.out.println("\n");

		
		Cavalo Spirit = new Cavalo("Spirit",3,"500kg","1,80");
		Spirit.imprimirCavalo();
		Spirit.emitirSom();
        Spirit.capacidade();
		System.out.println("\n");
		
		Pregui�a Antonio = new Pregui�a("Antonio a Pregui�a",1,"Choloepus didactylus"," Frutos");
		Antonio.imprimirPregui�a();
		Antonio.emitirSom();  
        Antonio.capacidade(); 
		System.out.println("\n");
		
 
	}

}
