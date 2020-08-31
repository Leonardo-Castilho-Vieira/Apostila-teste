package com.leonardo.tests.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FluxoTest {

	static List<Long> historico;
	
	@BeforeAll
	public static void init() {
		//Números pelo qual o 7 passa para chegar ao 1
		historico = Arrays.asList(7l,49l,97l,130l,10l);
	}
	
	@Test
	void testEntrouEmLoop() {
		assertTrue(Fluxo.verificarEntrouEmLoop(historico, 7));
		assertFalse(Fluxo.verificarEntrouEmLoop(historico, 11));
	}
	
	@Test
	void testContinuarProcessoFeliz() {
		//Validar se deve continuar processo (1 ou loop para)
		assertFalse(Fluxo.verificarContinuarProcesso(historico, 49));
		assertFalse(Fluxo.verificarContinuarProcesso(historico, 1));
		assertTrue(Fluxo.verificarContinuarProcesso(historico, 11));
	}
	
}
