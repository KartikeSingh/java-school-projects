// Importing the Scanner class
import java.util.Scanner;

public class fascinating {
    public static void main(String[] args) {
        // Creating the scanner object to get user's input
        Scanner sc = new Scanner(System.in);

        // Asking for the integer.
        System.out.println("Input a number to see if it is a Fascinating number");

        // Storing the integer
        int n = sc.nextInt();

        if(n > 999 || n < 100) {
            System.out.println(n + " is not a Fascinating number");
        } else {

            // Getting the string
            String no = "" + n + n * 2 + n * 3;
            boolean isFascinating = true;

            for(char i = '1'; i <= '9'; i++) {
                int i1 = no.indexOf(i), i2 = no.lastIndexOf(i);

                if(i1 == -1 || i1 != i2) {
                    isFascinating = false;
                    break;
                }
            }

            if (isFascinating)
                System.out.println(n + " is a Fascinating number");
            else
                System.out.println(n + " is not a Fascinating number");
        }
    }
}

// Fascinating number is a three digit number which includes all numbers from 1 to 9 and exactly once when multiplied by both 2 & 3  ( regardless of 0(s) )
// 192, 327 are example of fascinating numbers