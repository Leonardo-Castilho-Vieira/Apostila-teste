package com.leonardo.tests.exercicios;

import com.leonardo.tests.utils.TipoNumero;

public class Exercicio2 {
	
	public static String questao(double numeroBase) {
		if(TipoNumero.isNumeroFeliz(numeroBase)) {
			return numeroBase + " é um número feliz!";
		} else { 
			return numeroBase + " não é um número feliz!";
		}
	}

}
