public abstract class Veiculo {
    
    /*
    a classe abstrata : 
     - ela não pode ser instância
     - ela é um alto nivel de generalização
     - ela possui métodos concretos e construtores
     - métodos abstratos 
     
     
     
     
     */
    
    
    
    
    
    
    
    
    //atributo
    private String placa;
    private int velocidadeMax;
    private String combustivel;
    private String cor;
     public Veiculo() {
        super();
     }
	public Veiculo(String placa, int velocidadeMax, String cor, String combustivel) {
		this.placa = placa;
		this.velocidadeMax = velocidadeMax;
		this.cor = cor;
        this.combustivel = combustivel;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public String getCombutivel() {
		return combustivel;
	}
	public void setCombutivel(String combutivel) {
		this.combustivel = combutivel;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
    public abstract void mover();
    
    
}
