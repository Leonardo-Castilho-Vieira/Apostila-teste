package com.leonardo.tests.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * Determinar se � um n�mero feliz ou n�o
 * @author leona
 *
 */
public class Exercicio2Test {
	
	@Test
	void questao() {
		double numeroBase = 7;
		assertEquals(numeroBase + " � um n�mero feliz!", Exercicio2.questao(numeroBase));
		
		numeroBase = 8;
		assertNotEquals(numeroBase + " � um n�mero feliz!", Exercicio2.questao(numeroBase));
	}
}
