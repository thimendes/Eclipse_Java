package Atividades;

public class Teste_Animal {

	public static void main(String[] args) 
	{
		Cachorro Fofo = new Cachorro("Fofo ",1,"Dálmata","Branco com pintas brancas");
		Fofo.imprimirCachorro();
		Fofo.emitirSom();
        Fofo.capacidade();
		System.out.println("\n");

		
		Cavalo Spirit = new Cavalo("Spirit",3,"500kg","1,80");
		Spirit.imprimirCavalo();
		Spirit.emitirSom();
        Spirit.capacidade();
		System.out.println("\n");
		
		Preguiça Antonio = new Preguiça("Antonio a Preguiça",1,"Choloepus didactylus"," Frutos");
		Antonio.imprimirPreguiça();
		Antonio.emitirSom();  
        Antonio.capacidade(); 
		System.out.println("\n");
		
 
	}

}
