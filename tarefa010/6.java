/*6. Implementar um programa que:
  * leia um número inteiro
  * e imprima o seu antecessor e seu sucessor.*/

package tarefa;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa6
{
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
   	 
    	int numero;
   	 
   	 System.out.println("Informe um numero:");
   	 numero =  scanner.nextInt();
   	 
   	 System.out.println("Antecessor: " + (numero+1));
   	 System.out.println("\nSucessor: " + (numero-1));
    }
}
