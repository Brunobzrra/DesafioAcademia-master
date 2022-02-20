package q1_test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import questao_1.EscadaSimbolica;

/**
 * Classe responsavel por testar os metodos de construcao da escada da questao 1
 * 
 * @author bruno
 *
 */

public class EscadaSimbolicaTest {

	private final EscadaSimbolica usr = new EscadaSimbolica();

	/**
	 * Metodo para testar construcao da escada com tamanho valido.
	 */
	@Test
	public void escadaInvertidaVerticalTest() {
		usr.setTamanho(6);
		usr.setSimbolo("@");
		assertNotNull(usr.escadaInvertidaVertical());
	}

	/**
	 * Metodo para testar construcao da escada com tamanho negativo
	 */

	@Test
	public void escadaInvertidaVerticalNegativoTest() {
		usr.setTamanho(-2);
		System.out.println(usr.escadaInvertidaVertical());
		assertEquals("", usr.escadaInvertidaVertical());
	}

	/**
	 * Metodo para testar a montagem da escada em uma string unica
	 */
	@Test
	public void montarEscadaTest() {
		ArrayList<String> arrayTest = new ArrayList<String>();
		arrayTest.add("Madrugada");
		arrayTest.add("Combina");
		arrayTest.add("Com");
		arrayTest.add("Cafe");
		assertEquals("MadrugadaCombinaComCafe", usr.montarEscada(arrayTest));
	}

}
