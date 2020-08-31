package com.leonardo.tests.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TipoNumeroTest {
	
	@Test
	void testIsMultiplo() {
		assertTrue(TipoNumero.isMultiplo(9,3));
		assertFalse(TipoNumero.isMultiplo(2,3));
	}
	

	@Test
	void testIsNatural() {
		assertFalse(TipoNumero.isNumeroNatural(0));
		assertTrue(TipoNumero.isNumeroNatural(7));
		assertFalse(TipoNumero.isNumeroNatural(7.1));
		assertFalse(TipoNumero.isNumeroNatural(-15));
	}
	
	@Test
	void testIsNumeroFeliz() {
		assertTrue(TipoNumero.isNumeroFeliz(7));
		assertFalse(TipoNumero.isNumeroFeliz(8));
	}
	
	@Test
	void testIsPrimo() {
		assertTrue(TipoNumero.isPrimo(5));
		assertFalse(TipoNumero.isPrimo(4));
	}
	
}
