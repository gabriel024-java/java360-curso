import java.util.ArrayList;
import java.util.List;

public class Algoritmo42 {
    public void main(){
        /*
        Java 5
        James Gosling
        Coleção/Coleções (figurinhas)
        Collections
        -------------------------------
        Antes do Java 5 
        - calça normal
        -------------------------------
        Depois do Java 5
        - calça lycra
        -------------------------------
        */

        //List<String> nomes = new ArrayList<>();
        List<String> linguagens = List.of("Rust","Python","GO","Java","C","C++","C#");
        for(String linguagem:linguagens){
            IO.println(linguagem);
        }
    }
}
