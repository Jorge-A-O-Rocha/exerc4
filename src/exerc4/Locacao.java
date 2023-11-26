package exerc4;

public class Locacao {
	private String tempo;
	private double valorLocacao;
	private double caucao;
	private String finalidade;
	private String estado;
	private String 	dataLocacao;



	public void calcularPagto(Carro car, Cliente cli, Locacao loc ) {
		System.out.println("calculando pagamento");
	}

	public void calcularCaucao(Carro car, Cliente cli, Locacao loc) {
		System.out.println("calculando caução");
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public double getCaucao() {
		return caucao;
	}

	public void setCaucao(double caucao) {
		this.caucao = caucao;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(String dataLocacao) {
		this.dataLocacao = dataLocacao;
	}




}
