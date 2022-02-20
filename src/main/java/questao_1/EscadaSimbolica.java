package questao_1;


import java.util.ArrayList;

/**
 * Classe que representa a escada
 * 
 * @author bruno bezerra dos santos
 *
 */

public class EscadaSimbolica {

	private int tamanho;
	private String simbolo;

	/**
	 * Construtor vazio para utiliza��o
	 */

	public EscadaSimbolica() {
		
	}

	/**
	 * Construtor com paramentros
	 * 
	 * @param tamanho
	 * @param simbolo
	 */

	public EscadaSimbolica(int tamanho, String simbolo) {
		this.tamanho = tamanho;
		this.simbolo = simbolo;
	}

	/**
	 * Metodo responsavel pela construcao da escada invertida horizontalmente, no
	 * tamanho desejado. Para isso, foi utilizado um algoritmo que itera utilizando 
	 * a variável tamanho, que corresponde ao tamanho da escada, e para cada iteração
	 * uma variável eh responsável por contar a quantidade de espaços (que corresponde a iteração
	 * atual menos o tamanho total), onde essa vai ser adicionada ao ArrayList, onde cada adição
	 * representa uma linha. Utilizando o método repeat, essas strings são adicionadas o 
	 * número de vezes correspodente a iteração atual ou a quantidade calculada de espaços.
	 * 
	 * @return
	 */

	public String escadaInvertidaVertical() {
		ArrayList<String> listaAuxiliar = new ArrayList<>();
		for (int i = 0; i <= tamanho; i++) {
			int espaco = tamanho - i;
			listaAuxiliar.add(" ".repeat(espaco) + simbolo.repeat(i) + "\n");
		}
		return montarEscada(listaAuxiliar);
	}

	/**
	 * Metodo responsavel por montar a escada em si. Como um toString normal.
	 * 
	 * @param escadaNaoFormatada
	 * @return
	 */

	public String montarEscada(ArrayList<String> escadaNaoFormatada) {
		String escadaFormatada = "";
		for (String string : escadaNaoFormatada) {
			escadaFormatada += string;
		}
		return escadaFormatada;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

}
