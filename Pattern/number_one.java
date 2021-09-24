// Importing the Scanner class
import java.util.Scanner;

class number_one {
    // All of the patterns.
    static void one() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void two() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void three() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= 5 - i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void four() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void five() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void six() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void seven() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // The main method
    public static void main(String[] args) {
        // Defining the scanner class to get user input
        Scanner sc = new Scanner(System.in);

        // Getting the pattern they wanna see
        System.out.println("Choose the pattern you want. from 1 to x");
        // Storing the user input
        int c = sc.nextInt();

        // Check the option and excuting the corresponding method
        switch (c) {
            case 1:
                one();
                break;

            case 2:
                two();
                break;

            case 3:
                three();
                break;

            case 4:
                four();
                break;

            case 5:
                five();
                break;

            case 6:
                six();
                break;

            case 7:
                seven();
                break;

            // Invalid choice reply
            default:
                System.out.println("Invalid choice");
        }
    }
}