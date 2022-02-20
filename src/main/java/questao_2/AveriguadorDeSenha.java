package questao_2;

/**
 * Classe responsavel por verificar se a senha necessita de caracteres
 * 
 * @author Bruno Bezerra dos Santos
 *
 */
public class AveriguadorDeSenha {

	public AveriguadorDeSenha() {

	}

	/**
	 * Metodo utilizado para conferir se um caractere corresponde aos requisitos
	 * exigidos pelo site em questão.
	 * 
	 * @param caractere
	 * @return
	 */

	public static int conferirSenhaRequisitos(char caractere) {
		String conferida = "" + caractere;

		if (conferida.matches("[a-z]")) {
			return -1;
		}
		if (conferida.matches("[A-Z]")) {
			return -2;
		}
		if (conferida.matches("[0-9]")) {
			return -3;
		}
		// Caso nao for nenhuma das alternativas acima, será um caractere especial
		if (conferida.matches("\\W")) {
			return -4;
		}
		return 0;
	}

	/**
	 * Este método tem a funcao de validar a senha que é fornecida no paramentro,
	 * onde essa sera verificada de acordo com os critérios estabelecidos (metodo
	 * conferirSenhaRequisitos).
	 * 
	 * @param senha
	 * @return
	 */

	public static String senhaValida(String senha) {
		int qtdCaracteres = 0;
		/*
		 * Transformei a senha em um array de caracteres para facilitar a manipulação e
		 * verificação da existencia do tipo de caractere correspondente
		 */
		char[] senhaArray = senha.toCharArray();

		/*
		 * Array criado para verificar se os requisitos foram atendidos de forma única.
		 */
		boolean[] requisitosAlcancados = { false, false, false, false };

		final int MINUSCULO = 0;
		final int MAIUSCULO = 1;
		final int NUMERO = 2;
		final int ESPECIAL = 3;

		/*
		 * se a senha nao possuir 6 caracteres, automaticamente será inválida. a
		 * validacao de seus requisitos so ocorrera se algum desses nao for atendido,
		 * apos a senha estar em seu tamanho minimo.
		 */
		if (senha.length() < 6) {
			qtdCaracteres = 6 - (senha.length());
		} else {
			for (int i = 0; i < senhaArray.length; i++) {
				switch (conferirSenhaRequisitos(senhaArray[i])) {
				case -1:
					requisitosAlcancados[MINUSCULO] = true;
					break;
				case -2:
					requisitosAlcancados[MAIUSCULO] = true;
					break;
				case -3:
					requisitosAlcancados[NUMERO] = true;
					break;
				case -4:
					requisitosAlcancados[ESPECIAL] = true;
					break;
				}
			}
			/*
			 * caso um requisito nao seja alcancado, sera necessario adicionar mais um
			 * caractere (que seria o do requisito), para o site considerar a senha segura.
			 */
			for (boolean b : requisitosAlcancados) {
				if (!b) {
					qtdCaracteres++;
				}
			}
		}

		return qtdCaracteres + "";
	}

}
