package questao_3;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Classe responsável pelo fornecimento da quantidade de pares de anagramas
 * 
 * @author GeeksForGeeks
 *
 */

public class BuscadorAnagrama {

	/**
	 * Metodo responsavel pela identificacao do numero de pares de anagramas em uma
	 * string
	 * 
	 * @param anagrama
	 * @return
	 */

	public static int testAnagramaPares(String anagrama) {
		// mapa responsavel pela unicidade de cada par de anagrama
		HashMap<String, Integer> mapa = new HashMap<>();

		// esse laço vai definir o limite inferior da substring criada
		for (int i = 0; i < anagrama.length(); i++) {
			/**
			 * ja esse laco sera o limite inferior para cada substring, assim, eh criado uma
			 * nova substring
			 */
			for (int j = i; j < anagrama.length(); j++) {
				char[] valC = anagrama.substring(i, j + 1).toCharArray();
				Arrays.sort(valC);
				String val = new String(valC);
				/**
				 * Aqui vai ser verificado se ja contem a mesma chave no mapa, caso sim, o valor
				 * eh incrementado, eh assim que vamos identificar os pares
				 */
				if (mapa.containsKey(val))
					mapa.put(val, mapa.get(val) + 1);
				else
					mapa.put(val, 1);
			}
		}
		int paresDeAnagrama = 0;
		// esse laço vai verificar qual é a frequencia de repeticao das chaves
		// (anagramas)
		for (String key : mapa.keySet()) {
			int freq = mapa.get(key);
			// calculo dos pares de anagramas para cada repeticao de chave
			paresDeAnagrama += (freq * (freq - 1)) / 2;
		}

		return paresDeAnagrama;

	}
}
