
package ca.bcit.comp1510.lab06;

import java.util.Locale;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;

/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * 
 * @author Chaturvedi,Parth
 * @version 02-03-2021
 */

public class BaseballStats {
    
    /**
     * avgBatting - calculates the average batting rate of the person.
     * 
     * @param avgScan the scanner with the file data
     * @return the average batting rate 
     */
    
    public static String avgBatting(Scanner avgScan) {
        
        avgScan.useDelimiter(",");
        
        int hit = 0;
        int out = 0;
        int walk = 0;
        int sacrifice = 0;
        double avg;
        
        NumberFormat nf = NumberFormat.getInstance(Locale.CANADA); 
        
        while (avgScan.hasNext()) {
            String temp = avgScan.next();
            if (temp.equals("h")) {
                hit++;
            }
            if (temp.equals("s")) {
                sacrifice++;
            }
            if (temp.equals("o")) {
                out++;
            }
            if (temp.equals("w")) {
                walk++;
            }                
        }
        avg = (double) hit / (double) (hit + out);
        
        avgScan.close();
        
        return "walk = " + walk + " hit = " + hit + " out = " + out 
            + " sacrifice = " + sacrifice + " average batting rate = " 
            + ((hit + out > 0) ? nf.format(avg) : "0");
    }
    /**
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     * 
     * @param args (unused)
     */
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScan;
        Scanner lineScan;
        Scanner avgScan;
        String fileName;
        String bats;
        
        Scanner scan = new Scanner(System.in);        
        
        System.out.print("Enter the name of the input file: ");
        
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        
        while (fileScan.hasNext()) { 
            
            bats = fileScan.nextLine();
            System.out.println("line : " + bats);
            lineScan = new Scanner(bats);
            lineScan.useDelimiter(",");
            
            while (lineScan.hasNext()) {
                
                System.out.print(lineScan.next() + " ");                     
            }
            
            System.out.println(" ");
            avgScan = new Scanner(bats);
            avgScan.useDelimiter(",");
            System.out.println(avgBatting(avgScan));                            
        }
        scan.close();
    }
}

