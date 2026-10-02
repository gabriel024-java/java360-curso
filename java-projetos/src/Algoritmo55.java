import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//public class Algoritmo55 {
    /*
     Desafio
     Considerando a aula da lógica aristotelica e os programas de fluxograma e pseudocódigo a saber: 
     Crie um arquivo que possa armazenar valores de um dicionário
     Map (Interface) - HashMap (Classe)
     Laboratório - Laboratório de programação Java
     Chave: F07
     Chave: F07 Descrição: "Laboratório de programação Java"
     Chave: B03 Descrição: "Sala de Aula Padrão"
     Chave: G09 Descrição: "Oficina de Lanternagem e Pintura"

     Problema: Criar um cadastro de um dicionário de ambientes
     esse cadastro deverá armazenar em um arquivo.txt
     Deverá ter um loop ()     
     
    */
        //void main(){
      /*     record Laboratório(String setor, String sala, int numero){}
            public static void main(String [] args){
                 Map<String, Laboratório> dicionarioLaboratório = new HashMap<>();        
   int r = 0;
    do{
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String registro = LocalDateTime.now().format(formato);
        IO.println("Digite o setor e a sala: ");
          String setor = IO.readln();
          String sala = IO.readln();
    try(FileWriter arquivo = new FileWriter("registro.txt",true)){
        arquivo.write("[" + setor + "]" + sala);
         IO.println("Registrado: [" + registro + "][" + setor + "]" + sala);
         r = Integer.parseInt(IO.readln());
          dicionarioLaboratório.put("setor: ", new Laboratório(setor, sala, 0)
          );
    }catch(Exception e){
        IO.println(e.getMessage());
    }
        IO.print("registrar outras areas? ");
         r = Integer.parseInt(IO.readln());
        }while(r==1);

            List<String> lista = new ArrayList<>();
            for(String listas:lista){
                IO.println("Lista: "+listas);
            }
            
            
      //record Laboratório(String setor, String sala, int numero) {}
      //Map<String, Laboratório> dicionarioLaboratório = new HashMap<>();

      //dicionarioLaboratório.put("setor: ", new Laboratório ());
      //List<String> lista = List.of();
          
       


    }}
*/
    public class Algoritmo55 {
        void main(){
            Map<String, Laboratório> Laboratorios = new HashMap<>();
            Laboratório s1 = new Laboratório("F", "Informatica", 07);
            Laboratorios.put("F", s1);
            Laboratório s2 = new Laboratório("E", "Eletrica", 04);
            Laboratorios.put("E", s2);
            Laboratório s3 = new Laboratório("G", "Construção civil", 03);
            Laboratorios.put("G", s3);
            Laboratório s4 = new Laboratório("B", "Moda", 02);
            Laboratorios.put("B", s4);
            Laboratório s5 = new Laboratório("A", "SOE", 01);
            Laboratorios.put("A", s5);
            Laboratório s6 = new Laboratório("C", "Auditorio", 05);
            Laboratorios.put("C", s6);
            for(Laboratório e: Laboratorios.values()) {
                IO.println("Laboratório: "+e);
            }
            for(String setor: Laboratorios.keySet()){
                IO.println("Setor: "+setor);
            }
            int L = 0;
            do{
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String Laboratório = LocalDateTime.now().format(formato);
            try(FileWriter arquivo = new FileWriter("Laboratorios.txt",true)){
                arquivo.write("Laboratórios: "+Laboratorios);
                L = Integer.parseInt(IO.readln());
            }catch(Exception e){
                IO.println(e.getMessage());
            }
            IO.print("Deseja adicionar mais laboratórios? ");
                L = Integer.parseInt(IO.readln());
            }while(L==1);
            List<String> LaboratoriosLista = new ArrayList<>();
            for(String listas:LaboratoriosLista){
                IO.println("Lista: "+listas);
            }
        }
    }
    










        

        

    
    
    













































  

