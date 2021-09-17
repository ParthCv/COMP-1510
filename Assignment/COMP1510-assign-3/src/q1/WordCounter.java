package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program to calculate and display top ten words with most frequency.
 *
 * @author Parth,Chaturvedi
 * @version 29-04-2021
 */
public class WordCounter {
    
    /**
     * For the number 10.
     */
    
    public static final int TEN = 10;
    
    /**
     * List to store the words.
     */
    
    private static List<Word> words = new ArrayList<Word>();
    
    /**
     * Counts unique words and adds the new words.
     * @param file name
     * @return the number of unique words
     * @throws FileNotFoundException if not found
     */
    
    public int parseBook(String file) throws FileNotFoundException {
        
        Scanner fileScan;

        fileScan = new Scanner(new File(file));     

        while (fileScan.hasNext()) {
            String word = fileScan.next();
            boolean wordExist = false;
            for (int i = 0;  i < (words.size() - 1); i++) {
                if (words.get(i).getWord().equals(word)) {
                    words.get(i).incrementFrequency();
                    wordExist = true;
                }               
            }
            if (!wordExist) {
                Word c = new Word(word);
                words.add(c);
            }
        }   
        fileScan.close();

        return (words.size());
    }
    
    /**
     * Prints the top 10 words.
     */
    
    public void printTopWords() {
        
        words.sort(null);
        for (int i = 0; i < TEN; i++) {
            System.out.print(words.get(i).toString());
        }        
    }

    
    /**
     * Drives the program.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        WordCounter wc = new WordCounter();
        //wc.parseBook("bible.txt");
        System.out.println("The number of unique words : " 
                + wc.parseBook("bible.txt"));
        System.out.println();
        System.out.println("The top 10 words are :\n");
        wc.printTopWords();        
    }


}
