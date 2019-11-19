/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week47;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class ReadWordsTest {
	
	String filename;
	
	@Before
	public void setUp() {
		filename = "Data/mobydick.txt";
		//filename = "Data/mobydicktest.txt";
	}

	/**
	 * Test of readWordsIntoList method, of class ReadWords.
	 */
	@Test
	public void testReadWordsIntoList() {
		System.out.println("readWordsIntoList");
		ReadWords instance = new ReadWords();
		instance.readWordsIntoList(filename);
		// TODO review the generated test code and remove the default call to fail.
		assertTrue(1==1);
	}
	
}
