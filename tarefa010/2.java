/*2. Implementar um programa que:
 * imprima a média aritmética dos números 8,9 e 7.
 * A média dos números 4, 5 e 6.
 * A soma das duas médias.
 * A média das médias.*/

package tarefa;

public class Programa2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
  	 
		int media1 = (8 + 9 + 7)/3;
		int media2 = (4 + 5 + 6)/3;
		System.out.println("Media aritmetica dos numeros 8, 9 e 7: " + media1);
		System.out.println("Media aritmetica dos numeros 4, 5 e 6: " + media2);
  	 
		int somaMedias = media1 + media2;
		double mediaFinal = (double)somaMedias/2;
  	 
		System.out.println("Soma das duas medias: " + somaMedias);
		System.out.println("Media das medias: " + mediaFinal);
   }
}

