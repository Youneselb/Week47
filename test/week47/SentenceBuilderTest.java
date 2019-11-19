package week47;

import java.util.LinkedList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class SentenceBuilderTest {
	String filenamePronouns;
	String filenameVerbs;
	String filenameArticles;
	String filenameNouns;
	String filenameAdj;
	String filenameConj;
	
	@Before
	public void setUp() {
	filenamePronouns = "Data/pronouns";
	filenameVerbs = "Data/verbs";
	filenameArticles = "Data/article";
	filenameNouns = "Data/nouns";
	filenameAdj = "Data/adj";
	filenameConj = "Data/conj";
	}

	/**
	 * Test of loadFromFile method, of class SentenceBuilder.
	 */
	@Test
	public void testLoadFromFile() {
		System.out.println("loadFromFile");
		String filename = "";
		SentenceBuilder instance = new SentenceBuilder(filenamePronouns, filenameVerbs, filenameArticles, filenameNouns);
		String expResult = instance.buildSentence();
		String result = "kurt vernerW";
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}
	
}
