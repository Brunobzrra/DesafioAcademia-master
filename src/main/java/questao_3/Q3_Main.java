package questao_3;

import java.util.Scanner;

/**
 * 
 * @author bruno
 *
 */

public class Q3_Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira uma string");

		String valor = entrada.nextLine();
		entrada.close();

		System.out.println(BuscadorAnagrama.testAnagramaPares(valor));
	}
}
