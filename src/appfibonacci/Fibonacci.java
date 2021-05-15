
package appfibonacci;

public class Fibonacci {
    //Atributo
    private int totalTermos;
    
    //Sobrecarga de construtor
    public Fibonacci(int totalTermos) {
        this.totalTermos = totalTermos;
    }
    
    public Fibonacci() {
    }
    
    //Métodos
    public int getTotalTermos() {
        return totalTermos;
    }

    public void setTotalTermos(int totalTermos) {
        this.totalTermos = totalTermos;
    }
    
    public String serieFibonacci(){
        int ant=0;
        int atual=1;
        int prox;
        String serie=ant+"  ";
        for (int cont=1; cont < totalTermos;cont++){
           serie+=atual+"  ";
            prox=ant+atual;
            ant=atual;
            atual=prox;
        }
        return serie;
    }
    
    }
