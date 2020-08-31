package com.leonardo.tests.exercicios;

import java.util.List;

import com.leonardo.tests.utils.GeraListas;
import com.leonardo.tests.utils.Soma;

public class Exercicio1 {

//	
//	public static void main(String[] args) {
//		List<Integer> mult3Ou5 = getMultiplosDistintosPorDivisores(999, 3,5);
//		List<Integer> mult7 = getMultiplos(999, 7);
//		
//		List<Integer> comuns = getMultiplosComuns(mult3Ou5, mult7);
//		
//		for (Integer multiplicador : comuns) {
//			System.out.println("Multiplicadores: " + multiplicador);
//		}s
//		
//		
//		System.out.println("\n\n\n ~~~~~~~~~~~~~~~~~~~~~~~~~~~  \n\n\n");
//		
//		comuns = getMultiplosComunsPorDivisores(999, 3,5);
//		
//		for (Integer multiplicador : comuns) {
//			System.out.println("Multiplicadores: " + multiplicador);
//		}
//	}
	
	
	/**
	 * <b>Questão:</b>	Qual é o valor da soma de todos os números múltiplos de 3 ou 5 de números naturais abaixo de 1000?
	 * 
	 * @param alcance
	 * @param divisor1
	 * @param divisor2
	 * @return
	 */
	public static Long questao1(int alcance, int divisor1, int divisor2) {
		return Soma.somaMultiplicadores(GeraListas.getMultiplosDistintosPorDivisores(alcance, divisor1,divisor2));
	}
	
	/**
	 * 
	 * <b>Questão:</b>	Qual é o valor da soma de todos os números múltiplos de 3 ou 5 de números naturais abaixo de 1000?
	 * 
	 * @param alcance
	 * @param divisor1
	 * @param divisor2
	 * @return
	 */
	public static Long questao2(int alcance, int divisor1, int divisor2) {
		return Soma.somaMultiplicadores(GeraListas.getMultiplosComunsPorDivisores(alcance, divisor1,divisor2));
	}
	
	/**
	 * 
	 * <b>Questão:</b>	Qual é o valor da soma de todos os números múltiplos de (3 ou 5) e 7 de números naturais abaixo de 1000?
	 * 
	 * @param alcance
	 * @param divisor1
	 * @param divisor2
	 * @param divisor3
	 * @return
	 */
	public static Long questao3(int alcance, int divisor1, int divisor2, int divisor3) {
		List<Integer> mult3Ou5 = GeraListas.getMultiplosDistintosPorDivisores(alcance, divisor1, divisor2);
		List<Integer> mult7 = GeraListas.getMultiplos(alcance, divisor3);
		
		return Soma.somaMultiplicadores(GeraListas.getMultiplosComuns(mult3Ou5, mult7));
	}
	
//   public static List<Integer> gerarListaFinal(int alcance, final String[] operacaoLog, int... divisores) {
//	   
//	   List<Integer> listaFinal = new ArrayList<Integer>();
//	   
//	   if(divisores != null && divisores.length > 0) {
//		   for (int i = 0; i < (divisores.length -1); i++) {
//			   
//			   if(operacaoLog != null) {
//				   String operacao = operacaoLog[i];
//				   switch (operacao) {
//				   
//				   case "&&":
//					   listaFinal.addAll(getMultiplosComuns(listaFinal, getMultiplos(alcance,divisores[i+1])));
//					   break;
//				   case "||":
//					   
//					   listaFinal.addAll(getMultiplosDistintos(getMultiplos(alcance, divisores[i]), getMultiplos(alcance,divisores[i+1])));
//					   
//					   break;
//					   
//				   default:
//					   throw new IllegalArgumentException("Operação lógica invalida para a interacao entre listas");
//				   }
//			   } else {
//				   
//				   listaFinal = Exercicio1.getMultiplos(alcance, divisores[0]);
//			   }
//			
//		   }
//	   } else {
//		   throw new IllegalArgumentException("o parâmetro \"int divisores\" precisa ter pelo menos um valor");
//	   }
	   
//	   return listaFinal;
//   }
	
}
