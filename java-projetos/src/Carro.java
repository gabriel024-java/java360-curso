public class Carro extends Veiculo implements IManutencao,IMeusImpostos {
    private int numPortas;
    public Carro() {
        super();
    }
   public Carro(String placa, int velocidadeMax, String cor, String combustivel, int numPortas) {
	super(placa, velocidadeMax, cor, combustivel);
	this.numPortas = numPortas;
   }

   public int getNumPortas() {
	return numPortas;
   }

   public void setNumPortas(int numPortas) {
	this.numPortas = numPortas;
   }
   @Override
   public void mover() {
	// TODO Auto-generated method stub
	IO.print("Começou a andar sozinho");
   }
   @Override
   public void adicionar() {
	// TODO Auto-generated method stub
	IO.print("Taxação de: ");
   }
   @Override
   public void revisaoProgramada() {
	// TODO Auto-generated method stub
	IO.print("Faça revisão de taxa de:"+IManutencao.TAXA);
   }
    
}
