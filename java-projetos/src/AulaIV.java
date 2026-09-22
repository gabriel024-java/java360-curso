import java.util.List;

public class AulaIV {
    public void main(){
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

       //faz exatamente a mesma coisa que: n -> System.out.println(n);
        numeros.forEach(System.out :: println);
}

}
