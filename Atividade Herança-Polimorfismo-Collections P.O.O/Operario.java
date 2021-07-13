package Atividades;

public class Operario extends Pessoa
{
	//minha classe Operario vai herdar todas as caracter�sticas da classe Pessoa
	
		//declara��o dos atributos da classe Operario
		private double valorProducao;
		private double comissao;
		
		//criar o construtor da classe Operario
		public Operario(String nome,String endereco,String cpf,int telefone,int idade,double valorProducao,double comissao)
		{
			super(nome,endereco,cpf,telefone,idade);//passar os par�tros para a minha super classe
			this.valorProducao = valorProducao;//inicializando os atributos da classe Operario
			this.comissao = comissao;
		}

		public double getValorProducao() {
			return valorProducao;
		}

		public void setValorProducao(double valorProducao) {
			this.valorProducao = valorProducao;
		}

		public double getComissao() {
			return comissao;
		}

		public void setComissao(double comissao) {
			this.comissao = comissao;
		}
		
		//criar os m�todos espec�ficos da classe Operario
			public void imprimirInfo()
			{
				System.out.println("\nNome do operario: "+getNome()+"\n"+"CPF: "+getCpf()
				+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"
				+"Endere�o: "+getEndereco()+"\n"
				+"\nValor monet�rio total dos artigos produzidos por "+getNome()+": "+valorProducao
				+"\nPorcentagem (sem o %) da comiss�o deste artigo: "+comissao);
			}
			
			public void calcularSalario()
			{
				double valorTotal = valorProducao + (valorProducao * (comissao/100));
				System.out.println("\nO valor total a ser recebido pelo oper�rio: "+getNome()
				+" � igual a: "+valorTotal);
			}
			
			public void validarCpf()
			{
				if(getCpf().length()!=11)
				{
					System.out.println("\n--CPF Inv�lido!!!");
				}
				else
				{
					System.out.println("\n--CPF V�lido!!!");
				}
			}

}
