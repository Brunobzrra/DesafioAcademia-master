package q2_test;

import static org.junit.Assert.*;

import org.junit.Test;

import questao_2.AveriguadorDeSenha;

/**
 * Classe responsavel por realizar os testes unitarios da validacao de senha
 * 
 * @author bruno
 *
 */

public class AveriguadorDeSenhaTest {

	AveriguadorDeSenha testador = new AveriguadorDeSenha();

	/**
	 * Metodo para testagem dos requistos da senha, caractere por caractere.
	 */

	@Test
	public void conferirSenhaRequisitosTest() {
		assertEquals(-3, AveriguadorDeSenha.conferirSenhaRequisitos("1".charAt(0)));
		assertEquals(-1, AveriguadorDeSenha.conferirSenhaRequisitos("f".charAt(0)));
	}

	/**
	 * Metodo para testar funcionalidade de deteccao de caracteres especiais
	 */

	@Test
	public void conferirSenhaRequisitosAlfabetoGrego() {
		assertEquals(-4, AveriguadorDeSenha.conferirSenhaRequisitos("Ω".charAt(0)));
	}

	/**
	 * Metodo para testar insercao de senha valida na funcionalidade de validacao de
	 * senha
	 */

	@Test
	public void avaliarSenhaValida() {
		String senha = "sF!a22";
		assertEquals("0", AveriguadorDeSenha.senhaValida(senha));
	}

	/**
	 * Teste para verificar a insercao de senhas invalidas, de acordo com o cenario
	 */

	@Test
	public void avaliarSenhaInvalida() {
		String senha = "r";
		assertEquals("5", AveriguadorDeSenha.senhaValida(senha));
		senha = "asdasddsfvb";
		assertEquals("3", AveriguadorDeSenha.senhaValida(senha));
		senha = "asdFFBAs";
		assertEquals("2", AveriguadorDeSenha.senhaValida(senha));
		senha = "asdfgBA!@";
		assertEquals("1", AveriguadorDeSenha.senhaValida(senha));
		senha = "asdB!3";
		assertEquals("0", AveriguadorDeSenha.senhaValida(senha));
	}

}
