package Atividades;

public class Empregado extends Pessoa{

	//estou criando uma heran�a da classe Pessoa
		//isso quer dizer que o Empregado1 ir� herdar todas as cria��es da classe Pessoa	
			
			//declarar os atributos da classe Empregado1
			private int codigoSetor;
			private float salarioBase;
			private float imposto;//esses atributos s�o somente da classe Empregado1, ou seja, n�o est�o na super classe
			
			//cria��o do meu Construtor
			public Empregado(String nome,String endereco,String cpf,int telefone,int idade,int codigoSetor,float salarioBase,float imposto)
			{
				super(nome,endereco,cpf,telefone,idade);//quando eu uso a palavra reservada "super", eu indico que irei carregar os 
				//par�metros na minha super classe Pessoa
				this.codigoSetor = codigoSetor;//inicializando os atributos da minha pr�pria classe e por este motivo eu uso o this
				this.salarioBase = salarioBase;
				this.imposto = imposto;
			}

			public int getCodigoSetor() {
				return codigoSetor;
			}

			public void setCodigoSetor(int codigoSetor) {
				this.codigoSetor = codigoSetor;
			}

			public float getSalarioBase() {
				return salarioBase;
			}

			public void setSalarioBase(float salarioBase) {
				this.salarioBase = salarioBase;
			}

			public float getImposto() {
				return imposto;
			}

			public void setImposto(float imposto) {
				this.imposto = imposto;
			}
			
			//come�o a criar os m�todos espec�ficos da minha classe
			public void imprimirInfo()
			{
				System.out.println("\nNome do empregado: "+getNome()+"\n"+"CPF: "+getCpf()
				+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"
				+"Endere�o: "+getEndereco()+"\n"+"C�digo do setor: "+codigoSetor
				+"\nSal�rio Base: "+salarioBase+"\nValor em porcentagem (sem o %) de imposto a ser retido do sal�rio: "+imposto);
			}
			
			
			public void calcularSalario()
			{
				double salarioTotal = salarioBase - (salarioBase * (imposto/100));
				System.out.println("\nO sal�rio total a ser recebido pelo empregado "+getNome()
				+" � igual a: "+salarioTotal);
			}
}
