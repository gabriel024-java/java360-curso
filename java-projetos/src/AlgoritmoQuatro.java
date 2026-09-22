public class AlgoritmoQuatro {
    public void main(){
        //entre com um número inteiro e mostre se o número é positivo,negativo ou nulo
        int n = Integer.parseInt(IO.readln("Entre com um número: "));
      if (n>0){
        IO.println("O número é positivo!");
      }else if(n<0){
        IO.println("O número é negativo!");
      }else{
        IO.println("O número é nulo!");
      }
    // operador termário
    int a = 10;
    String resultado = (a>10) ? "maior que 10" : "menor ou igual a 10";
    IO.println(resultado);
    
    //estrutura de seleção múltipla 
    //continue
    int nunAula = Integer.parseInt(IO.readln("Entre com um numero de 1 a 4: "));
    switch(nunAula){
        case 1:
         IO.println("Segunda-feira");
         break;
        case 2:
         IO.println("Terça-feira");
         break;
        case 3:
         IO.println("Quarta-feira");
         break;
        case 4:
         IO.println("Quinta-feira");
         break;
        default:
         IO.println("Folga");

       
    }
     


    }



      

}


