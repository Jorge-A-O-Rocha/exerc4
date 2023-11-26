package exerc4;

public class Cliente {
	private String nome;
	private String CNH;
	private boolean nomeLimpo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCNH() {
		return CNH;
	}
	public void setCNH(String cNH) {
		CNH = cNH;
	}
	public boolean isNomeLimpo() {
		return nomeLimpo;
	}
	public void setNomeLimpo(boolean nomeLimpo) {
		this.nomeLimpo = nomeLimpo;
	}
	
	public void verificarCNH(Cliente cli ) {
		System.out.println(" x pontos na carteira");
	}
	
	public void verificarNome(Cliente cli ) {
		System.out.println("Situação do nome da pessoa");
	}
}
