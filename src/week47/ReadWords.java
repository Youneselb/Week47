package week47;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ReadWords {
	
	Scanner sc;
	File fh;
	
	public void readWordsIntoList(String filename) {
		int tmpval = 0;
		/*
		TODO: Find collections til disse to:
		words = unique set of words
		wordfreq = hashmap of words,frequency

		TODO: Se hvad der sker med antal ord når flg bruges
		word = word.replaceAll("[.-_,'!\"]","");
		*/
		fh = new File(filename);
		
		sc = new Scanner(fh);
		while(sc.hasNextLine()) {
			/*
			TODO:Loop igennem alle linjer
			
			for () {

			}

			*/
			System.out.println("Size " + words.size());
			System.out.println("Size " + wordfreq.size());
		}
	}
}
