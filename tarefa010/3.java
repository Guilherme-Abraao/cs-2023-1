/*3. Implementar um programa que:
  * Leia o valor de um saldo e imprima-o com reajuste de 15%.*/

package tarefa;

import java.util.Scanner;

public class Programa3 {
    
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
   	 
    	double saldo;
   	 
   	 	System.out.println("Informe o saldo:");
   	 	saldo =  Double.parseDouble(scanner.nextLine());
   	 
   	 	double saldoReajustado = saldo * 1.15;
   	 
   	 	System.out.println("Saldo reajustado: " + saldoReajustado);
    }
}
