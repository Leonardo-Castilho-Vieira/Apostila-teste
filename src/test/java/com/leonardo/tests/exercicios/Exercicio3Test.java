package com.leonardo.tests.exercicios;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * 
 * Palavras em números
 * 
 * @author leona
 *
 */
public class Exercicio3Test {
	
	@Test
	void questao1() {
		//c = 3
		assertTrue(Exercicio3.questao1("c"));
		//d = 4
		assertFalse(Exercicio3.questao1("d"));
	}
	
	@Test
	void questao2() {
		//g = 7
		assertTrue(Exercicio3.questao2("g"));
		//h = 8
		assertFalse(Exercicio3.questao2("h"));
		
	}
	
	@Test
	void questao3() {
		//f = 6
		assertTrue(Exercicio3.questao3("f"));
		//e = 5
		assertTrue(Exercicio3.questao3("e"));
		//a = 1
		assertFalse(Exercicio3.questao3("a"));
	}
	
}
