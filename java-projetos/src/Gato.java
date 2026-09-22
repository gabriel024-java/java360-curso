public class Gato extends Animal {

    public Gato(String nome, String arquivoSom) {
        super(nome, arquivoSom);
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Pet milk");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("Tocando miau.mp3"+super.getArquivoSom());
    }
    
    
}
