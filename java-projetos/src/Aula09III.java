import java.util.List;

public class Aula09III {
    public void main(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        //sintaxe da lambda: (parâmetro) -> corpo
        numeros.forEach(n -> System.out.println(n));
    }
}
