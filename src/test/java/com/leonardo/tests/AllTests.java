package com.leonardo.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.leonardo.tests.exercicios.Exercicio3;
import com.leonardo.tests.exercicios.Exercicio2;

@RunWith(Suite.class)
@SuiteClasses({
	Exercicio3.class,
	Exercicio2.class})
public class AllTests {
		
}
