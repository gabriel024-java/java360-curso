import javax.swing.JOptionPane;

public class Algoritmo38 {
    /*
    Basica 
     objeto
     classe
     metodos workers
     contrutor
     get e set
    Avançado
     classe abstrata
     encapsulamento
     interfaces
     comparativo
     static
     
     */
   
     public void main(){
        JOptionPane.showMessageDialog(null, "Agência Senaicar");
        Carro c = new Carro("GOKL 47S9", 250, "Preto", "Etanol", 4);
        
        JOptionPane.showMessageDialog(null, c.getPlaca());
        JOptionPane.showMessageDialog(null, c.getCor());
        JOptionPane.showMessageDialog(null, c.getVelocidadeMax());
        JOptionPane.showMessageDialog(null, c.getCombutivel());
        JOptionPane.showMessageDialog(null, c.getNumPortas());
        c.mover();
        
        Moto m = new Moto("GFW4 44H1", 150, "Azul", "etanol", null);
        JOptionPane.showMessageDialog(null, m.getPlaca());
        JOptionPane.showMessageDialog(null, m.getCor());
        JOptionPane.showMessageDialog(null, m.getVelocidadeMax());
        JOptionPane.showMessageDialog(null, m.getCombutivel());
        c.mover();


     }
    


}
