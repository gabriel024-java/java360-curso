public class Algoritmo3 {
    void main(){
        int nota1, nota2, nota3;
        //números inteiros de 0 a 100
        //entrada das notas dos alunos
        //soma das notas
        //médias das notas
        // saida das notas, soma e média
        //operadores  +, -, *, /, %
        double media;
        nota1 = Integer.parseInt(IO.readln("Digite a primeira nota: "));
        nota2 = Integer.parseInt(IO.readln("Digite a segunda nota: "));
        nota3 = Integer.parseInt(IO.readln("Digite a terceira nota: "));
        int soma = nota1 + nota2 + nota3;
        media = soma / 3.0;
        IO.println("Notas: " + nota1 + "," + nota2 + "," + nota3);
        IO.println("Soma: " + soma);
        IO.println("Média: " + media);
         if (nota1 == 3){
            IO.println("Parabens! você esta aprovado");
         }else{
            IO.println("Reprovado! mais sorte na próxima");
            
         }

         if (nota2 == 3){
            IO.println("Parabens! você esta aprovado");
         }else{
            IO.println("Reprovado! mais sorte na próxima");

         }

         if (nota3 == 3){
            IO.println("Parabens! você esta aprovado");
         }else{
            IO.println("Reprovado! mais sorte na próxima");
         }
    }
}
