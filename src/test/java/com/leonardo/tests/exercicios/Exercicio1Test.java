package com.leonardo.tests.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercicio1Test {

//	Resposta https://math.stackexchange.com/questions/9259/find-the-sum-of-all-the-multiples-of-3-or-5-below-1000 233168
	@Test
	void questao1() {
		assertEquals(233168, Exercicio1.questao1(999, 3, 5));
	}
	
	
//  Resposta http://www.facom.ufu.br/~albertini/prossiga/index.php/Realizar_soma_n%C3%BAmeros_abaixo_de_1000
	@Test
	void questao2() {
		assertEquals(33165, Exercicio1.questao2(999, 3,5));
		
	}
	
	@Test
	void questao3() {
		assertEquals(33173, Exercicio1.questao3(999, 3 , 5, 7));
	}


}
