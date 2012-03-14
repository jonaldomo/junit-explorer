package com.github.jonaldomo.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitExplorerTest {

	@Test
	public void testMultiply() {
		assertEquals("First multiply test", 40, JUnitExplorer.multiply(8,5));
		
		assertTrue("Second multiply test", JUnitExplorer.multiply(5, 6) == 30);
		
		assertNull("Third multiply test", null);
		
		assertNotNull("Fourth test", 1);
		
		int firstArray[] = {1, 2, 3};
		int secondArray[] = {1, 2, 3};
		assertArrayEquals("Fifth test", firstArray, secondArray);
	}

}
