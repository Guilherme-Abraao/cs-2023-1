/*6. Implementar um programa que:
  * leia um número inteiro
  * e imprima o seu antecessor e seu sucessor.*/

package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class Programa6 {
	
	private static final Logger logger = System.getLogger(Programa6.class.getName());
	
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
   	 
    	int numero;
   	 
   	 	logger.log(Level.INFO, "Informe um numero:");
   	 	numero =  scanner.nextInt();
   	 
   	 	logger.log(Level.INFO, "Antecessor: " + (numero+1));
   	 	logger.log(Level.INFO, "\nSucessor: " + (numero-1));
   	 	
   	 	scanner.close();
    }
}
