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
	LinkedList<String> verbs;
	LinkedList<String> articles;
	LinkedList<String> nouns;
	ListIterator<String> pronounIterator ;
	ListIterator<String> verbIterator ;
	ListIterator<String> articleIterator;
	ListIterator<String> nounIterator ;
	File fh;
	Scanner sc;
	
	public SentenceBuilder(String pronouns, String verbs, String articles, String nouns) {
		this. pronouns = loadFromFile(pronouns);
		this.verbs = loadFromFile(verbs);
		this.articles = loadFromFile(articles);
		this.nouns = loadFromFile(nouns);
		pronounIterator = this.pronouns.listIterator();
		verbIterator = this.verbs.listIterator();
		articleIterator = this.articles.listIterator();
		nounIterator = this.nouns.listIterator();
	}
	
	public LinkedList loadFromFile(String filename) {
		LinkedList<String> myList = new LinkedList<>();
		fh = new File(filename);
		try {
			
			sc = new Scanner(fh);
			while (sc.hasNextLine()) {
				String word = sc.nextLine();
				myList.add(word);
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		return myList;
	}
	
	public String buildSentence() {
		String mySentence = "";
		String pronoun = "";
		String verb = "";
		String article = "";
		String noun = "";

		if (pronounIterator.hasNext()) {
			pronoun = pronounIterator.next();
		} else {
			pronounIterator = this.pronouns.listIterator();
			pronoun = pronounIterator.next();
		}
		
		if (verbIterator.hasNext()) {
			verb = verbIterator.next();
		} else {
			verbIterator = this.verbs.listIterator();
			verb = verbIterator.next();
		}
		
		if (articleIterator.hasNext()) {
			article = articleIterator.next();
		} else {
			articleIterator = this.articles.listIterator();
			article = articleIterator.next();
		}
		
		if (nounIterator.hasNext()) {
			noun = nounIterator.next();
		} else {
			nounIterator = this.nouns.listIterator();
			noun = nounIterator.next();
		}
		
		mySentence = String.format("%s %s %s %s", pronoun,verb,article,noun);
		return  mySentence;
	}
	
}
