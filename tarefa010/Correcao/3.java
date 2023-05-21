/*3. Implementar um programa que:
  * Leia o valor de um saldo e imprima-o com reajuste de 15%.*/

package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class Programa3 {
    
	private static final Logger logger = System.getLogger(Programa3.class.getName());
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
   	 
    	double saldo;
   	 
   	 	logger.log(Level.INFO, "Informe o saldo:");
   	 	saldo =  Double.parseDouble(scanner.nextLine());
   	 
   	 	double saldoReajustado = saldo * 1.15;
   	 
   	 	logger.log(Level.INFO, "Saldo reajustado: " + saldoReajustado);
   	 	
   	 	scanner.close();
    }
}
