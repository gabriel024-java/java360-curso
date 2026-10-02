import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
    public void main(){

        int r = 0;
        do{
              //1 o formato do carimbo: dia/mês/ano ás hora:minuto:segundo
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            
                //amanhã - manipular aqui..
                IO.println("Digite uma dúvida?");
                String duvida = IO.readln();

                //2 carimbo capturando no momento do registro
                String carimbo = LocalDateTime.now().format(formato);

            try(FileWriter arquivo = new FileWriter("Registro.txt",true)){
                
                arquivo.write("[" + carimbo + "] " + duvida + " \n");
                IO.println("Registrado: [" + carimbo + "] " + duvida);
                IO.println("Deseja registrar nova mensagem 1-sim 0-não: ");
                r = Integer.parseInt(IO.readln());

            }catch(Exception e){
              IO.println(e.getMessage());
            }

            IO.print("adicionar msg:1[sim] 0[não]");
            r = Integer.parseInt(IO.readln());
        }while(r==1);

    }    
}