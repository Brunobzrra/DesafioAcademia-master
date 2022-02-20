package questao_1;


import java.util.Scanner;

/**
 * Classe responsavel pela execucao do programa da questao 1
 * 
 * @author bruno bezerra dos santos
 *
 */

public class Q1_Main {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual o tamanho da escada?");

		int tam = entrada.nextInt();

		EscadaSimbolica escada = new EscadaSimbolica(tam, "*");

		entrada.close();

		System.out.println(escada.escadaInvertidaVertical());
	}
}
