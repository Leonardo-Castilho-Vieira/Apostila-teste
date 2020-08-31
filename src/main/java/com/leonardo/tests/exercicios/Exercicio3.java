package com.leonardo.tests.exercicios;

import com.leonardo.tests.utils.Soma;
import com.leonardo.tests.utils.TipoNumero;

public class Exercicio3 {

	public static boolean questao1(String palavra) {
		Long valorPalavra = Soma.somarPalavra(palavra);
		
		return TipoNumero.isPrimo(valorPalavra);
	}
	
	public static boolean questao2(String palavra) {
		Long valorPalavra = Soma.somarPalavra(palavra);
		
		return TipoNumero.isNumeroFeliz(valorPalavra);
	}
	
	public static boolean questao3(String palavra) {
		Long valorPalavra = Soma.somarPalavra(palavra);
		
		return TipoNumero.isMultiplo(valorPalavra, 3) || TipoNumero.isMultiplo(valorPalavra, 5);
	}
	
}
