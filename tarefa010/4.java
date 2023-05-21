/*4. Implementar um algoritmo que lê:
 * a porcentagem do IPI a ser acrescido no valor das peças;
 * o código da peça 1,
 * valor unitário da peça 1,
 * quantidade de peças 1
 * o código da peça 2,
 * valor unitário da peça 2,
 * quantidade de peças 2

 O programa deve calcular o valor total a ser pago e apresentar o resultado.

 Fórmula : _(valor1*quant1 + valor2*quant2)_*_(IPI/100 + 1)_*/

package tarefa;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Programa4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
  	 
		Peca peca1 = new Peca();
		
		Peca peca2 = new Peca();
  	 
		double ipi;
  	 
		System.out.println("Informe a porcentagem do IPI:");
		ipi =  Double.parseDouble(scanner.nextLine());
  	 
		System.out.println("Informe o codigo da peca 1:");
		peca1.codigo =  Integer.parseInt(scanner.nextLine());
  	 
		System.out.println("Informe o valor unitario da peca 1:");
		peca1.valor =  Double.parseDouble(scanner.nextLine());
  	 
		System.out.println("Informe a quantidade da peca 1:");
		peca1.quantidade =  Integer.parseInt(scanner.nextLine());
  	 
		System.out.println("Informe o codigo da peca 2:");
		peca2.codigo =  Integer.parseInt(scanner.nextLine());
  	 
		System.out.println("Informe o valor unitario da peca 2:");
		peca2.valor =  Double.parseDouble(scanner.nextLine());
  	 
		System.out.println("Informe a quantidade da peca 2:");
		peca2.quantidade =  Integer.parseInt(scanner.nextLine());
  	 
		double valorTotal = (peca1.valor*peca1.quantidade + peca2.valor*peca2.quantidade) * (ipi/100 + 1);
  	 
		System.out.println("Total a ser pago: " + df.format(valorTotal));
  	 
   }
}

class Peca{
	   int codigo;
	   int quantidade;
	   double valor;
	}
