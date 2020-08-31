package com.leonardo.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FormatarPalavraTest {

	@Test
	void testSomenteLetras() {
		//Não necessario pois o proprio Map faz o filtro
		assertEquals("abc", FormatarPalavra.somenteLetras("a1b2c3-@!"));
	}
}
