/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package week47;

import java.io.File;
import java.util.ListIterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class SentenceBuilder {
	LinkedList<String> pronouns;
	ListIterator<String> pronounIterator ;
	File fh;
	Scanner sc;
	
	public SentenceBuilder(String pronouns) {
		this.pronouns = loadFromFile(pronouns);
		pronounIterator = this.pronouns.listIterator();
		//TODO: the iterator
	}
	
	public LinkedList loadFromFile(String filename) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("Kurt");
		myList.add("Verner");
		//TODO: Replace Kurt and Verner with content from file
		return myList;
	}
	
	public String buildSentence() {
		String mySentence = "";
		String pronoun = "";
		if (pronounIterator.hasNext()) {
			pronoun = pronounIterator.next();
		} else {
			//TODO: what should happen when you reach the end
		}
		mySentence = String.format("%s ", pronoun);
		return  mySentence;
	}
	
}
