package exerc4;

public class Condicao {
	private String local;
	private String tipo;
	
	
	private String getLocal() {
		return local;
	}
	private void setLocal(String local) {
		this.local = local;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void levantarDano(Devolucao dev ) {
		System.out.println(" avarias");
	}
	
	public void calcularConserto(Devolucao dev ) {
		System.out.println("calculando conserto");
	}



}
