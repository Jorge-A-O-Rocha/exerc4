package exerc4;

public class Carro {
	private String marca;
    private String modelo;
    private int ano;
    private boolean status;
    
    public void verificarAno(Carro carro) {
      System.out.println(" ano x");
    }
    
    public boolean verificarStatus(Carro carro) {
        System.out.println(" verificar condições");
        return status;
      }
    
	private String getMarca() {
		return marca;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	private String getModelo() {
		return modelo;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	private int getAno() {
		return ano;
	}
	private void setAno(int ano) {
		this.ano = ano;
	}
	private boolean getStatus() {
		return status;
	}
	private void setStatus(boolean status) {
		this.status = status;
	}
    
}
