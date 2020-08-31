package com.leonardo.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ElevadoQuadradoTest {
	
	@Test
	void testElevar() {
		assertEquals(49.0, ElevadoQuadrado.elevar(7));
		assertEquals(25d, ElevadoQuadrado.elevar(5));
	}

	
}
