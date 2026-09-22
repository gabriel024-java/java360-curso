import javax.swing.JOptionPane;

public class Algoritmo39 {
    /*
     Revisão:
     - classe abstrata
     - interfaces
     - polimorfismo
     - encapsulamento
     - static
     
     Transporte
     Onibus
     Metro
    */
   public void main(){

        Onibus o1 = new Onibus("FR3 43K0");
        Onibus o2 = new Onibus("KTS J436");
        Onibus o3 = new Onibus("AET 4697");

        Metro m1 = new Metro("SDG 3259");
        Metro m2 = new Metro("ARG 3R25");
        Metro m3 = new Metro("ARH 32FW");

        String opcao = JOptionPane.showInputDialog("1 - Onibus, 2 - Metro");
        int op = Integer.parseInt(opcao);
        if (op==1){
            JOptionPane.showMessageDialog(null, o1.calcularTarifa());
        }else{
            JOptionPane.showMessageDialog(null, m1.calcularTarifa());
        }
    }







}
