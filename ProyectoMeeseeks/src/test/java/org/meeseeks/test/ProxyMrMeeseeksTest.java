package org.meeseeks.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.meeseeks.clases.MrMeeseeks;
import org.meeseeks.clases.ProxyMrMeeseeks;

public class ProxyMrMeeseeksTest {

	@Test
	public void pushButtonTest() {
		ProxyMrMeeseeks box = new ProxyMrMeeseeks();
		ArrayList <MrMeeseeks>  setMrMe  = new ArrayList();
		
		for(int i = 1; i<100;i++){
			box.pushButton(setMrMe);
			assertEquals(i, setMrMe.size() );
		}
	}

}
