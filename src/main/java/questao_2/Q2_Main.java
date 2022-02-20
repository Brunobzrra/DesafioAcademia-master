package questao_2;

import java.util.Scanner;

/**
 * Classe responsável pela execução do programa da questão 2 do desafio
 * 
 * @author bruno
 *
 */

public class Q2_Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a senha a ser conferida: ");
		String senha = entrada.nextLine();

		entrada.close();

		System.out.println(AveriguadorDeSenha.senhaValida(senha));

	}
}
