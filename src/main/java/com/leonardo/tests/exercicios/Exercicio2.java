package com.leonardo.tests.exercicios;

import com.leonardo.tests.utils.TipoNumero;

public class Exercicio2 {
	
	public static String questao(double numeroBase) {
		if(TipoNumero.isNumeroFeliz(numeroBase)) {
			return numeroBase + " � um n�mero feliz!";
		} else { 
			return numeroBase + " n�o � um n�mero feliz!";
		}
	}

}
