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
	
	public void readWordsIntoList(String filename) {
		int tmpval = 0;
		/*
		words = words from file
		wordfreq = map of word and frequency in file
		*/
		fh = new File(filename);
		sc = new Scanner(fh);
		while(sc.hasNextLine()) {
			//TODO:write code to fill the two collections
		}
	}
	System.out.println("Size " + words.size());
	System.out.println("Size " + wordfreq.size());
}

