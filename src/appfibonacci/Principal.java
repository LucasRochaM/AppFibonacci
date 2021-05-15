
package appfibonacci;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Fibonacci fibo;
//   instanciando por meio do construtor com argumentos
//        fibo = new Fibonacci(Integer.parseInt(JOptionPane.showInputDialog(null,
//                          "Informe a qtde de termos para a série de Fibonacci",
//                          "AppFibonacci",3)));

 //ou com construtor vazio
         fibo = new Fibonacci();
         fibo.setTotalTermos(Integer.parseInt(JOptionPane.showInputDialog(null,
                          "Informe a qtde de termos para a série de Fibonacci",
                          "AppFibonacci",3))); //3 corresponde ao ícone da constante QUESTION_MESSAGE
         
         JOptionPane.showMessageDialog(null,fibo.serieFibonacci(),
                                                              "AppFibonacci",1);
         
         System.exit(0);
                 
    }
    
}
