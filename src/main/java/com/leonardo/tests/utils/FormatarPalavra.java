package com.leonardo.tests.utils;

public class FormatarPalavra {

	/**
	 * 
	 * Remove qualquer caracter que não seja uma letra
	 * 
	 * @param palavra
	 * @return
	 */
	public static String somenteLetras(String palavra) {
		return palavra.replaceAll("[^A-Za-z]+", "");
	}
}
