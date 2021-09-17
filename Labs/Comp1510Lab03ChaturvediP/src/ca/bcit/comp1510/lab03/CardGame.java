/**
 * 
 */

package ca.bcit.comp1510.lab03;

import java.util.Random;

/**
 * CardGame - randomly chooses a card.
 * @author Dell
 * @version 2021-02-01
 */

public class CardGame {

    enum Rank {
        
        /**
         * for ace.
         */
        
        ace,
        
        /**
         * for two.
         */
        
        two,
        
        /**
         * for three.
         */
        
        three,
        
        /**
         * for four.
         */
        
        four,
        
        /**
         * for five.
         */
        
        five,
        
        /**
         * for six.
         */
        
        six,
        
        /**
         * for seven.
         */
        
        seven,
        
        /**
         * for eight.
         */
        
        eight,
        
        /**
         * for nine.
         */
        
        nine,
        
        /**
         * for ten.
         */
        
        ten,
        
        /**
         * for jack.
         */
        
        jack, 
        
        /**
         * for queen.
         */
        
        queen,
        
        /**
         * for king.
         */
        
        king
    }
    
    enum Suit {
        
        /**
         * for hearts.
         */
        Hearts, 
        
        /**
         * for spades.
         */
        
        Spades,
        
        /**
         * for clubs.
         */
        
        Club, 
        
        /**
         * for diamonds.
         */
        
        Diamonds 
    }
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
       
        Random rand = new Random();
        
        int randomRankChoice = rand.nextInt(Rank.values().length);
        Rank randomRank = Rank.values()[randomRankChoice];
        
        int randomSuitChoice = rand.nextInt(Suit.values().length);
        Suit randomSuit = Suit.values()[randomSuitChoice];
        
        System.out.println("Your card is " + randomRank + " of " 
            + randomSuit);
        
    }

}
