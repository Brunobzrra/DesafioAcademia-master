package q3_test;

import static org.junit.Assert.*;

import org.junit.Test;

import questao_3.BuscadorAnagrama;

/**
 * Classe designada para executar os testes do programa da questao 3 do desafio
 * 
 * @author bruno
 *
 */

public class BuscadorAnagramaTest {

	/**
	 * Metodo que representa o teste para um anagrama valido
	 */
	@Test
	public void fornecerAnagramaEsperado() {
		assertEquals(2, BuscadorAnagrama.testAnagramaPares("ovo"));
	}

	/**
	 * Metodo que representa o teste para um anagrama vazio
	 */
	@Test
	public void fornecerAnagramaVazio() {
		assertEquals(0, BuscadorAnagrama.testAnagramaPares(""));
	}

	/**
	 * Metodo que representa o teste para um anagrama com caracteres repetidos
	 */
	@Test
	public void fornecerAnagramaRepetido() {
		assertEquals(4, BuscadorAnagrama.testAnagramaPares("aaa"));
	}

	/**
	 * Aqui o anagrama gera um erro devido ao acento
	 */
	@Test
	public void fonrcerAnagramaCaractereEspecial() {
		assertEquals(0, BuscadorAnagrama.testAnagramaPares("anã"));
	}
}
