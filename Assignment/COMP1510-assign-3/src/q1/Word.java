/**
 * 
 */

package q1;

/**
 * Word class - takes a word and its frequency. 
 * 
 * @author Chaturvedi, Parth
 * @version 29-03-2021
 */

public class Word implements Comparable<Word> {
    
    /**
     * frequency of the word.
     */
    
    private int frequency;
    
    /**
     * The unique word.
     */
    
    private final String word;
    
    Word(String wrd) {
        word = wrd;
        frequency = 1;
    }
    
    /**
     * the word.
     * @return the word
     */
    
    public String getWord() {
        return word;
    }
    
    /**
     * frequency of the word.
     * @return frequency of the word.
     */
    
    public int getFrequency() {
        return frequency;
    }
    
    /**
     * increments the frequency.
     */
    
    public void incrementFrequency() {
        frequency++;
    }
    
    /**
     * toSting method for class.
     * 
     * @return the word and frequency
     */
    
    public String toString() {
        return word + " = " + frequency + "\n";
    }
    
    @Override
    public int compareTo(Word o) {
        return Integer.compare(o.getFrequency(), this.frequency);
    }

}
