package com.leonardo.tests.utils;

import java.util.ArrayList;
import java.util.List;

public class GeraListas {
	
	/**
	 * 
	 * @param alcance um número natural
	 * @param divisor será usado para descobrir os números multiplicadores dentro do alcance
	 * @return Lista de multiplicadores do divisor dentro do alcance passado como parametro
	 */
	public static List<Integer> getMultiplos(int alcance, int divisor) {
		if(alcance == 0) {
			throw new IllegalArgumentException("0 não é um número natural");
		}
		
		List<Integer> multiplos = new ArrayList<Integer>();
		for (int i = 1; i <= alcance; i++) {
			if(TipoNumero.isMultiplo(i, divisor)) {
				multiplos.add(i);
			}
		}
		return multiplos;
	}

	public static List<Integer> getMultiplosComunsPorDivisores(int alcance, int divisor1, int divisor2) {
		List<Integer> lista1 =  getMultiplos(alcance, divisor1);
		List<Integer> lista2 =  getMultiplos(alcance, divisor2);
		
		return getMultiplosComuns(lista1, lista2);
	}
	
	public static List<Integer> getMultiplosComuns(List<Integer> lista1, List<Integer> lista2) {
		List<Integer> listaComum = new ArrayList<Integer>();
		
		 for (Integer i: lista1) {
		    if (lista2.contains(i)) {
		    	listaComum.add(i);
		    }
		 }
		 
		 return listaComum;
	}
	
	
	public static List<Integer> getMultiplosDistintosPorDivisores(int alcance, int divisor1, int divisor2) {
		List<Integer> lista1 =  getMultiplos(alcance, divisor1);
		List<Integer> lista2 =  getMultiplos(alcance, divisor2);
		
		return getMultiplosDistintos(lista1, lista2);
	}
	
	/**
	 * Retorna todos os múltiplos únicos para as duas listas
	 */
	public static List<Integer> getMultiplosDistintos(List<Integer> lista1, List<Integer> lista2) {
		List<Integer> listaComum = new ArrayList<Integer>(lista1);
		
		 for (Integer i: lista1) {
			 if(lista2.contains(i)) {
				 lista2.remove(i);
			 }
		 }
		 
		 listaComum.addAll(lista2);
		 return listaComum;
	}
	
	public static List<Integer> longToArrayList(long valor) {
		String valorS = Long.toString(valor);
		List<Integer> arrayI = new ArrayList<Integer>();
		
		for (int i = 0; i < valorS.length(); i++) {
			
			arrayI.add(valorS.charAt(i) - '0');
		}
		
		return arrayI;
	}
	
	
}
