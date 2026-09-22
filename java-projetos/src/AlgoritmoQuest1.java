//calculadora
public class AlgoritmoQuest1{
    void main(){
        int x, y ;
        x = Integer.parseInt(IO.readln("Digite o primeiro número: "));
        y = Integer.parseInt(IO.readln("Digite o segundo número: "));
        int soma = x + y ;
        IO.println("Adição: " + soma);
        int menos = x - y;
        IO.println("Subtração: " + menos);
        int multiplicação = x * y;
        IO.println("Multiplicação: " + multiplicação);
        int divisão = x / y;
        IO.println("Divisão: " + divisão);



    }
}
