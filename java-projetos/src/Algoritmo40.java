public class Algoritmo40 {
    public void main(){
        /*
        vetor: 
        - matriz unidimensional
        utilizados:
        - academico
        - programação simples
        tabela:
        - matriz bidimensional
        utilizado:
        - banco de dados
        - planilha de excel
        3D:
        - matriz tridimensional
        utilizado:
        - cinema
        - desenhos
        - animações
        - games
        - AutobCAD
        - revit
        - SketchUP
        - softwares 3D de simulação
        - minecraft x, y e z
        */

        // vetor ou matriz unidimensional 
        // matriz linha ou matriz coluna

        int[] notas = {7,9,5,10,6};
        int maior = notas[0];
        IO.println("Maior:"+maior);
        for(int i=1;i<notas.length;i++){
            if(notas[i] > maior){
                maior = notas[i];
            }
        }
        IO.println("Maior nota: "+maior);











    }
}
