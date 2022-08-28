import java.util.*;

public class Number {
    Number() {
        throw new Error(
                "You are not supposed to make a object of this class, It is only a utility class to perform differenct functions on matrix.");
    }

    // Reverse a number
    static int reverse(int n) {
        // Declaring the required variables
        int temp = n, rev = 0;

        // Reversing the number
        while (temp > 0) {
            // Getting the digit
            int d = temp % 10;
            temp = temp / 10;

            // Adding the digit to the number
            rev = (rev * 10) + d;
        }

        return rev;
    }

    // Check if a number is strontio number
    static boolean strontio(int n) {
        // Declaring variables
        int temp = n * 2, tens = 0, hundreds = -1;

        // Checking for invalid values
        if (temp < 1000 || temp > 9999)
            return false;

        // Getting the tens and hundreds digit
        for (int i = 0; i < 3; i++) {
            int d = temp % 10;
            temp = temp / 10;

            if (i == 1)
                tens = d;
            else if (i == 2)
                hundreds = d;
        }

        return tens == hundreds;
    }

    // Check if a number is armstrong number
    static boolean armstrong(int n) {
        // Declaring the required variables
        int temp = n, product = 0;

        // Getting the product of the digits
        while (temp > 0) {
            int d = temp % 10;
            temp = temp / 10;

            product += (d * d * d);
        }

        return product == n;
    }

    // Check if the provided number is valid ISBN code
    static boolean isISBN(long n) {
        long temp = n, sum = 0;

        for (int i = 1; temp > 0; i++) {
            long d = temp % 10;
            temp /= 10;

            sum += i * d;
        }

        return sum % 11 == 0;
    }

    // Get factorial of a number
    static int factorial(int n) {
        // Declaring the required variables
        int factorial = 1;

        // Getting the factorial
        while (n > 0) {
            factorial *= n;
            n--;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a integer to reverse it");
        int n = sc.nextInt();

        System.out.println("Reversed form: " + reverse(n));

        System.out.println("Input a integer to get its factorial");
        n = sc.nextInt();

        System.out.println("Factorial: " + factorial(n));

        System.out.println("Input a integer to check if its a strontio number");
        n = sc.nextInt();

        if (strontio(n))
            System.out.println(n + " is a strontio number");
        else
            System.out.println(n + " is not a strontio number");

        System.out.println("Input a integer to check if its a armstrong number");
        n = sc.nextInt();

        if (armstrong(n))
            System.out.println(n + " is a armstrong number");
        else
            System.out.println(n + " is not a armstrong number");

        System.out.println("Input a integer to check if its a valid ISBN code");
        n = sc.nextInt();

        if (isISBN(n))
            System.out.println(n + " is a valid ISBN code");
        else
            System.out.println(n + " is not a valid ISBN code");
    }
}