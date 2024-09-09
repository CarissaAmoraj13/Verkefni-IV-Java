
/******************************************************************************
 *  Nafn    : Ma. Kathy Carissa Jamora Todtod
 *  T-póstur: mkc4@hi.is
 *
 *  Lýsing  :  Compares the number of medals won by two countries to determine which one is higher on the medal leaderboard.
 *
 *
 *****************************************************************************/

import java.util.Scanner;

public class Medaliur {

    // Main function
    public static void main(String[] args) {
        // Scanner to read input from standard input
        Scanner scanner = new Scanner(System.in);

        // Reading medals for country one: gold1, silver1, bronze1
        int gold1 = scanner.nextInt();
        int silver1 = scanner.nextInt();
        int bronze1 = scanner.nextInt();

        // Reading medals for country two: gold2, silver2, bronze2
        int gold2 = scanner.nextInt();
        int silver2 = scanner.nextInt();
        int bronze2 = scanner.nextInt();

        // Logic to determine which country is higher in the medal ranking
        if (gold1 > gold2) {
            System.out.println("land eitt vann"); // Country one won
        } else if (gold1 < gold2) {
            System.out.println("land tvö vann"); // Country two won
        } else {
            // If gold medals are equal, check silver medals
            if (silver1 > silver2) {
                System.out.println("land eitt vann"); // Country one won
            } else if (silver1 < silver2) {
                System.out.println("land tvö vann"); // Country two won
            } else {
                // If both gold and silver medals are equal, check bronze medals
                if (bronze1 > bronze2) {
                    System.out.println("land eitt vann"); // Country one won
                } else if (bronze1 < bronze2) {
                    System.out.println("land tvö vann"); // Country two won
                } else {
                    // If all medals are equal, the countries are tied
                    System.out.println("löndin eru jöfn"); // The countries are tied
                }
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
