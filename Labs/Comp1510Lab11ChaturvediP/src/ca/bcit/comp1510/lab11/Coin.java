package ca.bcit.comp1510.lab11;

import java.io.IOException;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;
    
    /** Key. */
    private int key;
    
    /** lock. */
    private boolean locked;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     * @throws IOException Locked
     */
    public Coin() throws IOException {
        if (!locked) {
            flip();
        } else {
            throw new IOException("Locked");
        }
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() throws IOException {
        if (!locked) {
            face = (int) (Math.random() * 2);
        } else {
            throw new IOException("Locked");
        }
    }

    /**
     * Returns true if the current face of the Coin is heads.
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * @return toString description
     */
    public String toString() {
        if (!locked) {
            String faceName;
    
            if (face == HEADS) {
                faceName = "Heads";
            } else {
                faceName = "Tails";
            }
            return faceName;
        }
        
        return "locked";
    }

    @Override
    public void setKey(int key) {
        this.key = key;        
    }

    @Override
    public boolean lock(int tKey) {
        if (tKey == key) {
            locked = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean unlock(int tKey) {
        if (tKey == key) {
            locked = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean locked() {
        return locked ? true : false;       
    }
}

