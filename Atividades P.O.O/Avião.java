package Atividades;

public class Avi�o 
{
	private String passageiro;
	private String cpf;
	private String numerodDePoltrona;
	
	public Avi�o(String nome,String cpf, String poltrona)
	{
		this.passageiro = nome;
		this.cpf = cpf;
		this.numerodDePoltrona = poltrona;
	}
	public void imprimirInfo() 
	{
		System.out.println("Sr(a):"+passageiro+" do portador do cpf: "+cpf+ ", n�mero da poltrona: " +numerodDePoltrona);
				
	}
	public String getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(String passageiro) {
		this.passageiro = passageiro;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumerodDePoltrona() {
		return numerodDePoltrona;
	}
	public void setNumerodDePoltrona(String numerodDePoltrona) {
		this.numerodDePoltrona = numerodDePoltrona;
	}
	
}
