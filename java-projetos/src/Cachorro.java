public class Cachorro extends Animal {

    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Raçao Camil pra Cães");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("Tocando auau.mp3");
    }
    
}
