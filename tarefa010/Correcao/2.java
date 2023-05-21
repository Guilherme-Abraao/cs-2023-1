/*2. Implementar um programa que:
 * imprima a média aritmética dos números 8,9 e 7.
 * A média dos números 4, 5 e 6.
 * A soma das duas médias.
 * A média das médias.*/

package tarefa;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Programa2 {
	
	private static final Logger logger = System.getLogger(Programa2.class.getName());

	public static void main(String[] args) {
  	 
		int media1 = (8 + 9 + 7)/3;
		int media2 = (4 + 5 + 6)/3;
		
		logger.log(Level.INFO, "Media aritmetica dos numeros 8, 9 e 7: " + media1);
		logger.log(Level.INFO, "Media aritmetica dos numeros 4, 5 e 6: " + media2);
  	 
		int somaMedias = media1 + media2;
		double mediaFinal = (double)somaMedias/2;
  	 
		logger.log(Level.INFO, "Soma das duas medias: " + somaMedias);
		logger.log(Level.INFO, "Media das medias: " + mediaFinal);
   }
}

