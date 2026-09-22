public class Moto extends Veiculo implements IManutencao,IMeusImpostos{
    private Boolean temBau;
    public Moto() {
         super();
    }
	public Moto(String placa, int velocidadeMax, String cor, String combustivel, Boolean temBau) {
		super(placa, velocidadeMax, cor, combustivel);
		this.temBau = temBau;
	}
	public Boolean getTemBau() {
		return temBau;
	}
	public void setTemBau(Boolean temBau) {
		this.temBau = temBau;
	}
	@Override
	public void mover() {
		// TODO Auto-generated method stub
		IO.print("A moto se mexeu sozinha");
	}
	@Override
	public void adicionar() {
		// TODO Auto-generated method stub
		IO.print("Impostos adicionados");
	}
	@Override
	public void revisaoProgramada() {
		// TODO Auto-generated method stub
		IO.print("Faça a revisão com a taxa de:"+IManutencao.TAXA);
	}
    
}
