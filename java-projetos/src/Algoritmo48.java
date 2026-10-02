public class Algoritmo48 {
    /*
    --> Considere a matriz quadrada
    
    20,50,80,
    45,60,90
    45,67,89

    --> faça um algoritmo que mostre apenas os valores
    --> da diagonal principal
    */
    public void main(){
        double[][] matriz={
        {20, 50, 80},
        {45, 60, 90},
        {45, 67, 89},
        };
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                IO.println(matriz[i][j]);
            }
        }
    }


}
