public class Algoritmo54 {
    /*
    Toda classe começa com letra Maíuscula
    Pacote - package (separar as coisas por assunto)
    Criar a classse Algoritmo54.java
    Método main - ponto de entrada do programa
    Silogismo
    Premissa 1 - Todos os homens são mortais
    Premissa 2 - Sócrates é homem
    Premissa 3 - Sócrates é mortal
    Eemplo de silogismo - número par
    */
   void main(){
          int n =8; //premissa 1 - número par é divisivel por 2
             if(n%2==0){//premissa 2 - se o resto da divisão por 2 é igual a 0
            IO.println("O número " + n + " é par.");//conclusão - o número é par
                }else{
            IO.println("O número " + n + " é impar.");//conclusão - o número é impar
    }
  }
}