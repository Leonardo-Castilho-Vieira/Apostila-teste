package com.leonardo.tests.utils;

import java.util.List;
import java.util.Map;

public class Soma {
	
	/**
	 * Soma todos os valores da lista
	 * @param multiplicadores
	 * @return
	 */
	public static Long somaMultiplicadores(List<Integer> multiplicadores) {
		long sum = multiplicadores.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}
	
	public static Long somarRaizes(List<Integer> valores) {
		long produtoFinal = 0;
		
		for (int valor : valores) {
			produtoFinal += ElevadoQuadrado.elevar(valor);
		}
		return Long.valueOf(produtoFinal);
	}
	
	public static Long somarPalavra(String palavra) {
		long total = 0;
		Map<Character, Integer> dePara = PalavraParaNumero.getDePara();
		
		for (char letra : palavra.toCharArray()) {
			total += dePara.get(letra);
		}
		
		return Long.valueOf(total);
	}
}
