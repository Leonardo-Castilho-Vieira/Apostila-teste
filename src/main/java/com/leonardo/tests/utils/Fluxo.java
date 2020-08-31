package com.leonardo.tests.utils;

import java.util.List;

public class Fluxo {
	
	public static boolean verificarContinuarProcesso(List<Long> historicoNumeros, long valorAtual) {
		if(valorAtual == 1) 
			return false;
		
		return !verificarEntrouEmLoop(historicoNumeros, valorAtual);
	}
	
	public static boolean verificarEntrouEmLoop(List<Long> historicoNumeros, long valorAtual) {
		for (long i : historicoNumeros) {
			if(valorAtual == i)
				return true;
		}
		
		return false;
	}
}
