package com.leonardo.tests.utils;

import java.util.ArrayList;
import java.util.List;

public class TipoNumero {

	public static boolean isMultiplo(long numeroNatural, int divisor) {
		return numeroNatural % divisor == 0; 
	}
	
	public static boolean isNumeroFeliz(double numeroBase) {
		if(!isNumeroNatural(numeroBase)) {
			throw new IllegalArgumentException("Parametro precisar ser um número natural (inteiro e positivo)");
		}
		
		long produto = (long) numeroBase;
		List<Long> historicoNumeros = new ArrayList<Long>();
		historicoNumeros.add((long) numeroBase);
		List<Integer> produtoArray = null;
		
		produto =  (long) ElevadoQuadrado.elevar((int) produto);
		
		do {
			historicoNumeros.add(produto);
			produtoArray = GeraListas.longToArrayList(produto);
			
			produto = Soma.somarRaizes(produtoArray);
			
		} while (Fluxo.verificarContinuarProcesso(historicoNumeros, produto));
		
		return produto == 1;
	}
	
	public static boolean isNumeroNatural(double numero) {
		if (numero == (int) numero
				&& numero > 0)
			return true;
			
		return false;
	}
	
	public static boolean isPrimo(long numero) {
	    for (int i = 2; i < numero; i++) {
	        if (numero % i == 0) {
	        	return false;   
	        }
	    }
	    return true;
	}
	
}
