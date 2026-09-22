public class Algoritmo37 {
    void main(){
        Cachorro c = new Cachorro("TonTon", "rugido do tonton.mp3");
        IO.println("nome: "+c.getNome());
        c.comer();
        c.tocarSom();

        Gato g = new Gato("Lua", "rugido da lua.mp3");
        IO.println("nome: "+g.getNome());
        g.comer();
        g.tocarSom();


    }
}
