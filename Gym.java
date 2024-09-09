
/******************************************************************************
 *  Nafn    : Ma. Kathy Carissa Jamora Todtod
 *  T-póstur: mkc4@hi.is
 *
 *  Lýsing  :  
 * Reads two integers: the maximum heart rate (max pulse) and the excercise heart rate (pulse)
 *
 *
 *****************************************************************************/

import java.util.Scanner;

public class Gym {

    // Main function
    public static void main(String[] args) {
        // Scanner to read input from standard input
        Scanner scanner = new Scanner(System.in);

        // Reading two integers from input: maximum heart rate and exercise heart rate
        int hamarkpuls = scanner.nextInt();
        int puls = scanner.nextInt();

        // Check if the input is valid (exercise heart rate should be between 0 and
        // maximum heart rate)
        if (puls > hamarkpuls || puls < 0) {
            System.out.println("Ólöglegt inntak"); // Invalid input
        } else {
            // Calculate the percentage of the exercise heart rate relative to the maximum
            // heart rate
            double percent = (double) puls / hamarkpuls * 100;

            // Determine the range and print the appropriate result
            if (percent <= 50) {
                System.out.println("ekki æfing"); // not exercising
            } else if (percent <= 60) {
                System.out.println("upphitun"); // warm-up
            } else if (percent <= 70) {
                System.out.println("fitubrennsla"); // fat burning
            } else if (percent <= 80) {
                System.out.println("loftháð"); // aerobic
            } else if (percent <= 90) {
                System.out.println("loftfirrð"); // anaerobic
            } else {
                System.out.println("hámark"); // maximum
            }
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
