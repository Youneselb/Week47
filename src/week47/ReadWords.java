package week47;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class ReadWords {
	
	Scanner sc;
	File fh;
	Set<String> words;
	HashMap<String, Integer> wordfreq;
	LinkedList<String> verbs;
	LinkedList<String> nouns;
	LinkedList<String> adverbs;
	LinkedList<String> prepos;
	LinkedList<String> konj;
	
	public void readWordsIntoList(String filename) {
		int tmpval = 0;
		words = new HashSet<String>();
		wordfreq = new HashMap< String, Integer>();
		fh = new File(filename);
		try {
			
			sc = new Scanner(fh);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] lineArr = line.split(" ");
				for (String s:lineArr) {
					//s = s.replaceAll("[.-_,'!\"]","");
					words.add(s);
					try {
						tmpval = wordfreq.get(s);
						tmpval++;
						wordfreq.put(s,tmpval);
					} catch (Exception e) {
						tmpval = 1;
						wordfreq.put(s,tmpval);
					}
				}
				
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
		System.out.println("Size " + words.size());
		System.out.println("Size " + wordfreq.size());
		//System.out.println("Map" + wordfreq);
		
	}
	
	
}
