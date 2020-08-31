package com.leonardo.tests.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GeraListasTest {
	static List<Integer> mult3;
	static List<Integer> mult5;
	static List<Integer> mult3Ou5;
	static List<Integer> arrayProduto;
	
	@BeforeAll
	public static void init() {
		//Múltiplos de 3 e/ou de 5 abaixo de 10
		mult3 = Arrays.asList(3,6,9);
		mult5 = Arrays.asList(5);
		mult3Ou5 = new ArrayList<Integer>(mult3);
		mult3Ou5.addAll(mult5) ;
		arrayProduto = Arrays.asList(4,9);
		
	}
	
	@Test
	void testGetMultiplo() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {GeraListas.getMultiplos(0,3);});
		assertTrue("0 não é um número natural".contains(exception.getMessage()));
		
		assertTrue(GeraListas.getMultiplos(2,3).isEmpty());
		assertFalse(GeraListas.getMultiplos(3,3).isEmpty());

		//Validar as listas (Ver hamcrest)
		Assert.assertEquals(mult3, GeraListas.getMultiplos(9,3));
		Assert.assertEquals(mult5, GeraListas.getMultiplos(9,5));
	}
	
	@Test
	void testGetMultiplosComuns() {
		// 15 mmc de 3,5
		assertTrue(GeraListas.getMultiplosComuns(mult3, mult5).isEmpty());
		assertFalse(GeraListas.getMultiplosComuns(mult3, Arrays.asList(3)).isEmpty());
	}
	
	@Test
	void testGetMultiplosComunsPorDivisores() {
		assertTrue(GeraListas.getMultiplosComunsPorDivisores(14,3,5).isEmpty());
		assertFalse(GeraListas.getMultiplosComunsPorDivisores(15,3,5).isEmpty());
	}
	
	@Test
	void testGetMultiplosDistintos() {
		//Testa o merge das listas
		Assert.assertNotEquals(GeraListas.getMultiplosDistintos(mult3, mult5), mult3);
		Assert.assertNotEquals(GeraListas.getMultiplosDistintos(mult3, mult5), mult5);
		Assert.assertEquals(GeraListas.getMultiplosDistintos(mult3, mult5), mult3Ou5);
	}
	
	@Test
	void testProdutoToArray() {
		Assert.assertEquals(arrayProduto, GeraListas.longToArrayList(49l));
	}

}
