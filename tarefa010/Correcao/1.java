/*1. Implementar um programa que:
	  * leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
	  * Leve em consideração o ano com 365 dias e o mês com 30.
	  * Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.*/

package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class Programa1 {
	
	private static final Logger logger = System.getLogger(Programa1.class.getName());
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int ano;
		int mes;
		int dia;
		int totalDias;
				
		logger.log(Level.INFO, "Informe a quantidade de anos:\n");
		ano = scanner.nextInt();
		
		logger.log(Level.INFO, "Informe a quantidade de meses:\n");
		mes = scanner.nextInt();
		
		logger.log(Level.INFO, "Informe a quantidade de dias:\n");
		dia = scanner.nextInt();
		
		totalDias = ano*365 + mes*30 + dia;
		
		logger.log(Level.INFO, "" + ano + " ano(s), " + mes + " mes(es) e " + dia + " dia(s) = " + totalDias + " dias.");
		
		scanner.close();
		
	}
}