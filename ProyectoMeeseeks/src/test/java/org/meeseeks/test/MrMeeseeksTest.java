package org.meeseeks.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.meeseeks.clases.MrMeeseeks;

public class MrMeeseeksTest {

	@Test
	public void formulateRequestTest() {
		
		MrMeeseeks mrMeeseeks = new MrMeeseeks();
		
		//formulateRequest  "Open", "stupid jar"
		
		assertEquals("Be a more complete woman", mrMeeseeks.formulateRequest("Be", "a more complete woman"));
		assertEquals("Be popular at school", mrMeeseeks.formulateRequest("Be", "popular at school"));
		assertEquals("Open stupid jar", mrMeeseeks.formulateRequest("Open", "stupid jar"));
		
		
	}

}
