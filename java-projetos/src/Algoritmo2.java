public class Algoritmo2 {
    void main(){
    //entrada de dados
        IO.println("Seja Bem-Vindo ao portal Java360!");
        String usuario = IO.readln("Qual o seu nome? ");
        IO.println("Olá, " + usuario + " !Bem-vindo ao portal.");
         //mais rapido sem metodos
         //int estrelas = 0;

         //mais lento com metodos (Classes Wrappers)
         //Integer.parseInt(Valor para conversão)
         int estrelas = 0;
         IO.println("Quem criou o Java?");
         IO.println("1 - James Gosling");
         IO.println("2 - Bill Gates");
         IO.println("3 - Steve Jobs");
         IO.println("4 - Mark Zuckmberg");
         int resp = Integer.parseInt(IO.readln("Digite o número: "));
          if (resp == 1){
            IO.println("Parabéns, você acertou!");
            estrelas = estrelas + 1;
          }else{
            IO.println("Você errou!");
          }
            IO.println("Você obteve " + estrelas + " estrelas.");





    }


    
}

