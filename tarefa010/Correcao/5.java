/*5. Implementar um programa que:
 * leia o valor do salário mínimo e o valor do salário de um usuário,
 * calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$1.045,00).*/

package tarefa;

import java.util.Scanner;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.DecimalFormat;

public class Programa5 {
	
	private static final Logger logger = System.getLogger(Programa5.class.getName());
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
  	 
		double valorSalarioMinimo;
		double valorSalarioUsuario;
		double quantidadeSalarioMinimo;

		logger.log(Level.INFO, "Informe o valor do salario minimo:");
		valorSalarioMinimo =  Double.parseDouble(scanner.nextLine());
	   
		logger.log(Level.INFO, "Informe o valor do salario do usuario:");
		valorSalarioUsuario =  Double.parseDouble(scanner.nextLine());
	   
		quantidadeSalarioMinimo = valorSalarioUsuario/valorSalarioMinimo;
 
		logger.log(Level.INFO, "A quantidade de salarios minimos recebidas e: " + df.format(quantidadeSalarioMinimo));
	   
		scanner.close();
	}
}
