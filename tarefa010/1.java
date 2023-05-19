/*1. Implementar um programa que:
	  * leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.
	  * Leve em consideração o ano com 365 dias e o mês com 30.
	  * Exemplo: 3 anos, 2 meses e 15 dias = 1170 dias.*/

package tarefa;

import java.util.Scanner;

public class Programa1 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int ano, mes, dia, total;
		
		System.out.println("Informe a quantidade de anos:\n");
		ano = scanner.nextInt();
		
		System.out.println("Informe a quantidade de meses:\n");
		mes = scanner.nextInt();
		
		System.out.println("Informe a quantidade de dias:\n");
		dia = scanner.nextInt();
		
		total = ano*365 + mes*30 + dia;
		
		System.out.println("" + ano + " ano(s), " + mes + " mes(es) e " + dia + " dia(s) = " + total + " dias.");
		
	}
}