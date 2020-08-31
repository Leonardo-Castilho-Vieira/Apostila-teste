package com.leonardo.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SomaTest {
	
	static List<Integer> arrayProduto;
	
	@BeforeAll
	public static void init() {
		//Múltiplos de 3 e/ou de 5 abaixo de 10
		arrayProduto = Arrays.asList(4,9);
		
	}

	@Test()
	void testSomaMultiplicadores() {
		assertEquals(23, Soma.somaMultiplicadores(GeraListas.getMultiplosDistintos(GeraListas.getMultiplos(9,3), GeraListas.getMultiplos(9,5))));
		assertEquals(23, Soma.somaMultiplicadores(GeraListas.getMultiplosDistintosPorDivisores(9, 3,5)));
	}
	
	@Test
	void testSomarRaizes() {
		assertEquals(97, Soma.somarRaizes(arrayProduto));
	}
	
	@Test
	void testSomarPalavra() {
		assertEquals(6, Soma.somarPalavra("abc"));
	}
	
}
