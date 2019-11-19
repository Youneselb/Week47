/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package week47;

/**
 *
 * @author thor
 */
public class Week47 {
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		String filenamePronouns = "Data/pronouns";
		SentenceBuilder sb = new SentenceBuilder(filenamePronouns);
		System.out.println("S: " + sb.buildSentence());
	}
}
