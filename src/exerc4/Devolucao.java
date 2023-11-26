package exerc4;

public class Devolucao {
	private String dataDev;
	private String quilometragem;
	private String condicao;
	private String volTanque;
	public String getDataDev() {
		return dataDev;
	}
	public void setDataDev(String dataDev) {
		this.dataDev = dataDev;
	}
	public String getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}
	public String getCondicao() {
		return condicao;
	}
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	public String getVolTanque() {
		return volTanque;
	}
	public void setVolTanque(String volTanque) {
		this.volTanque = volTanque;
	}
	
	public void gerarDev(Locacao loc, Condicao cond ) {
		System.out.println(" o carro ta daquele jeito");
	}
	
	public double calcularMulta(Locacao loc, Condicao cond ) {
		double multa = 0;
		System.out.println(" vai pagar: "+ multa);
		return multa;
	}
}
