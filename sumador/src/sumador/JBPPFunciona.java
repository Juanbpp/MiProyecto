/**
 * 
 */
package sumador;

import java.util.Scanner;

/**
 * @author Juan Bautista Penalva Perez
 *
 */
public class JBPPFunciona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		String num = sc.next();
		ASumar suma = new ASumar(num);
		System.out.println(suma.mostrar());
	}

}
