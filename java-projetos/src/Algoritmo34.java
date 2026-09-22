public class Algoritmo34 {
    //Encapsulamento (pode esconder ou pode não esconder)
    // niveis de escapsulamento
    // - public, - private, - protected, - package
    // if public - todo mundo acessa
    // if private - somente a classe pode acessar
    // if protected - apenas as classes autorizadas podem acessar
    // if package - apenas no pacote
    private int primeiroNumero; //atributo
    private int segundoNumero; //atributo

    public void setPrimeiroNumero(int primeiroNumero){
        /* atribuir, receber, guarda usa *=* */
        this.primeiroNumero=primeiroNumero;
    }
    public int getPrimeiroNumero(){
        return primeiroNumero;
    }
    public void setSegundoNumero(int segundoNumero){
        this.segundoNumero=segundoNumero;
    }
    public int getSegundoNumero(){
        return segundoNumero;
    }





















}
