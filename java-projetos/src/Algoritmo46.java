import java.util.ArrayList;
import java.util.List;

public class Algoritmo46 {
    public void main(){
        /*
        List (lista) - 100,40,50,56
        Dictionary (Dicionario) - 100: Maria, 40: JP, 50: Daniel, 56: Cassio
        -- Pesquisa:
        GPT ou outro Mecanimismo de busca
        4 Interfaces
        4 Classes
        > ArrayList implementa List
        > HashMap implementa Map (chave --> valor)
        > HashSet implementa Set (conjunto)
        > LinkedList implementa Queue (fila)
        */
        List<String> frutas = new ArrayList<>();
        frutas.add("Goiaba");
        frutas.add("Amora");
        frutas.add("Melancia");
        frutas.add("Mamão");
        IO.println("primeira fruta: "+frutas.get(0));
        frutas.set(1,"Uva");
        for(String fruta:frutas){
            IO.println("elemento: "+fruta);
        }
        IO.println("Total de frutas: "+frutas.size());
        frutas.remove("Mamão");
        frutas.remove("Goiaba");
        frutas.remove("Melancia");
        IO.println("Total de Frutas: "+frutas.size());
        IO.println("Lista"+frutas);
        frutas.add("Laranja");
        frutas.add("Morango");
        IO.println("lista"+frutas);
        frutas.remove(1);
        IO.println("lista"+frutas);




















































































    }
}
