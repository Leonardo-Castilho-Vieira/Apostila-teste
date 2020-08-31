package com.leonardo.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class PalavraParaNumeroTest {

	@Test
	void testDePara() {
		assertEquals(1, PalavraParaNumero.getDePara().get('a'));
		assertEquals(27, PalavraParaNumero.getDePara().get('A'));
	}
	
}
