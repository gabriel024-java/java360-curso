//compra no supermercado
public class AlgoritmoQuest3{
    void main(){
        IO.println("Fazendo compras no supermercado!");
        IO.println("....");
        IO.println("Bom dia, senhor!");
        String cliente = IO.readln("Resposta: ");
        String resp1 = (IO.readln("CPF na nota? "));
        if (resp1.equalsIgnoreCase("sim")){
            IO.readln("Digite o CPF: ");
         }else{
            IO.println("OK");
         }
        IO.println("Tela do computador do mercado.");
        IO.println("Carne R$ 35");
        IO.println("Banana R$ 7");
        IO.println("Pão R$ 9");
        IO.readln("Deu R$ 51 senhor! qual a forma de pagamento?");
        int resp = Integer.parseInt(IO.readln("Valor da compra: "));
         if (resp == 51){
            IO.println("Pii Obrigada.");
         }else{
            IO.println("Compra negada!");
         }
    } 
    
}
