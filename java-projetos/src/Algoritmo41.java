public class Algoritmo41 {
    public void main(){
        /*
        - Matrizes
        - Matrizes bidimensional (2D)
        - 2 linhas e 2 colunas = 2x2 (matriz quadrada = mesme quatidade de coluna e linha)
        i: indentifica o número da linha (horizontal)
        j: indentifica o número da coluna (vertical)
        - tensores (N dimensões - Redes Neurais)
        */
      int[][] m = {
         {21,25},
         {33,35}
      };
      int soma=0;
      for(int i=0;i<m.length;i++){
        for(int j=0;j<m[i].length;j++){
            soma +=m[i][j];
        }
      }
      IO.println(soma);


















    }
}
