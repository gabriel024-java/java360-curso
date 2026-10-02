public class Laboratório {
    private String setor;
    private String sala;
    private int numero;
    public Laboratório() {
    }
	public Laboratório(String setor, String sala, int numero) {
		this.setor = setor;
		this.sala = sala;
		this.numero = numero;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Laboratório [setor=" + setor + ", sala=" + sala + ", numero=" + numero + "]";
	}
    
}
