public class Principal {
    void main(){
        //É uma instância de uma classe
        Algoritmo31 objeto = new Algoritmo31();
        //classe   //obj //a //op //operador
        IO.println(objeto.getAloMundo());
        objeto.printarNaTela();

        Algoritmo32 objeto2 = new Algoritmo32();
        String nome = IO.readln("Digite seu nome: ");
        objeto2.mostrarSalaEco("JP max plus");
        objeto2.mostrarSalaEco(nome);

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.println(objeto3.mostrarSala("Maria Eduarda"));

        




        Algoritmo34 alg34 = new Algoritmo34();
        alg34.setPrimeiroNumero(10);
        alg34.setSegundoNumero(10);
        IO.println(alg34.getPrimeiroNumero());
        IO.println(alg34.getSegundoNumero());

        Algoritmo35 alg35 = new Algoritmo35();
        alg35.setModelo("Vecão");
        IO.println(alg35.getModelo());
        alg35.setPlaca("JKJ 43G1");
        IO.println(alg35.getPlaca());
        alg35.setCavalos(133);
        IO.println(alg35.getCavalos());

        Algoritmo36 alg36 = new Algoritmo36();
        alg36.setHoraVisita(16);
        IO.println(alg36.getHoraVisita());
        alg36.setMinutoVisita(30);
        IO.println(alg36.getMinutoVisita());































    }
}
