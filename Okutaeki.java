
/******************************************************************************
 *  Nafn    : Ma. Kathy Carissa Jamora Todtod
 *  T-póstur: mkc4@hi.is
 *
 *  Lýsing  : categorizes vehicles into one of five weight categories based on user input. It reads an integer between 1 and 5
 * and outputs the corresponding vehicle weight category. 
 *
 *
 *****************************************************************************/

import java.util.Scanner;

public class Okutaeki {

    // Main function
    public static void main(String[] args) {
        // Create a scanner object to read input from the standard input
        Scanner scanner = new Scanner(System.in);

        // Read an integer from input (expected to be between 1 and 5)
        int category = scanner.nextInt();

        // Use a switch statement to determine the weight classification based on the
        // input
        switch (category) {
            case 1:
                System.out.println("Létt"); // Light vehicle (0 to 1,500 kg)
                break;
            case 2:
                System.out.println("Meðalþung"); // Medium-weight vehicle (1,501 to 3,500 kg)
                break;
            case 3:
                System.out.println("Þung"); // Heavy vehicle (3,501 to 7,500 kg)
                break;
            case 4:
                System.out.println("Mjög þung"); // Very heavy vehicle (7,501 to 16,000 kg)
                break;
            case 5:
                System.out.println("Mjög þung"); // Very heavy vehicle (16,001 kg and over)
                break;
            default:
                System.out.println("Ólöglegur flokkur"); // Invalid category
                break;
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
