import java.util.HashMap; //pacote
import java.util.Map; //pacote
//import javax.util.*;
/*
pacote é util
classe ou interface dentro do pacote

um pacote é um conjunto de classe e ou interfaces

*/

public class Algoritmo53 {
    void main(){
        /*
        Aurélio (dicionário)
        Chave - valor
        Manga - "fruta tropical"
        Teclado - "Instrumento musical"
        Java - "Arquipélago na Indonésia"
        Dictionary - Dicionário
        Json - (chave,valor) - JavaScript
        Dictionary (obsoleta) - Legado
        Generics - Definir qualquer Tipo <T> --> Generico
        Toda classe ela herda de Object
        */
        Map<String,Estudante> estudantes = new HashMap<>();
        Estudante e1 = new Estudante("JP","ADS", 2023);
        estudantes.put("MAT-1233",e1);
        Estudante e2 = new Estudante("Elias","Ciência da computação", 2023);
        estudantes.put("MAT-1234",e2);
        Estudante e3 = new Estudante("Daniel","Publicidade e propaganda",2016);
        estudantes.put("MAT-1235",e3);
        Estudante e4 = new Estudante("Cassio","ADS",2015);
        estudantes.put("MAT-1236",e4);
        Estudante e5 = new Estudante("Natália","Ciência da computação", 2026);
        estudantes.put("MAT-1237",e5);
        Estudante e6 = new Estudante("Maria Eduarda","ADS",2028);
        estudantes.put("MAT-1238",e6);
        Estudante e7 = new Estudante("Julio Cezar","TSI",2028);
        estudantes.put("MAT-1239",e7);
        Estudante e8 = new Estudante("Gabriel 1","AutodiData", 2026);
        estudantes.put("MAT-1240",e8);
        Estudante e9 = new Estudante("Fabio Pio","Marketing", 2026);
        estudantes.put("MAT-1241",e9);
        Estudante e10 = new Estudante("Carlos","ADS", 2016);
        estudantes.put("MAT-1242",e10);
        Estudante e11 = new Estudante("Gabriel 2","Engenharia de Software", 2028);
        estudantes.put("MAT-1243",e11);
        Estudante e12 = new Estudante("Thalita","ADS", 2026);
        estudantes.put("MAT-1244",e12);
        estudantes.put("MAT-1445",new Estudante("Rómulo","GTI", 2012));


        for(Estudante e : estudantes.values()) {
            IO.println(e);
        }
        for(String matricula : estudantes.keySet()) {
            Estudante e = estudantes.get(matricula);
            IO.println(matricula + " -> " +e);
        }
        
    }
}
