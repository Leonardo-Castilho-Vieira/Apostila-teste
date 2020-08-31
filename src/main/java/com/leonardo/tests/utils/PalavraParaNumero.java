package com.leonardo.tests.utils;

import java.util.HashMap;
import java.util.Map;

public class PalavraParaNumero {
	private static Map<Character, Integer> dePara = new HashMap<Character, Integer>();

	public static Map<Character, Integer> carregarDePara() {
		dePara = new HashMap<Character, Integer>();
		for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
			dePara.put(c, c-96);
		}
		
		for(char c : "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()) {
			dePara.put(c, c - 38);
		}
		
		return dePara;
	}
	
	public static Map<Character, Integer> getDePara() {
		if(dePara == null || dePara.isEmpty()) {
			carregarDePara();
		}
		return dePara;
	}
}
