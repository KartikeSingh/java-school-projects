
// Importing the Scanner class
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Creating the scanner object to get user's input
        Scanner sc = new Scanner(System.in);

        // Asking for the integer.
        System.out.println("Input a number to see if it is a Armstrong number");

        // Storing the integer
        int n = sc.nextInt();

        // Declaring the required variables
        int temp = n, product = 0;

        // Checking for invalid values
        while (temp < 100 || temp > 999) {
            System.out.println("The number should be a 4 digit number\n\nSo please provided the number again");
            n = sc.nextInt();
            temp = n * 2;
        }

        // Getting the product of the digits
        while (temp > 0) {
            int d = temp % 10;
            temp = temp / 10;
            
            product += (d * d * d);
        }

        // Printing the result
        if (product == n)
            System.out.println(n + " is a Armstrong number");
        else
            System.out.println(n + " is not a Armstrong number");
    }
}
