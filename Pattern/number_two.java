import java.util.Scanner;

class number_two {
    // All of the patterns.
    static void one(int limit) {
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void two(int limit) {
        for (int i = 1; i <= limit; i++) {
            for (int j = limit; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void three(int limit) {
        for (int i = 0; i < limit; i++) {
            for (int j = limit; j >= limit - i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void four(int limit) {
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void five(int limit) {
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= (limit + 1) - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void six(int limit) {
        for (int i = limit; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void seven(int limit) {
        for (int i = limit; i >= 1; i--) {
            for (int j = 1; j <= (limit + 1) - i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // The main method
    public static void main(String[] args) {
        // Defining the scanner class to get user input
        Scanner sc = new Scanner(System.in);

        // Getting the number limit
        System.out.println("Input the pattern number limit.");
        int limit = sc.nextInt();

        // Getting the pattern they wanna see
        System.out.println("Choose the pattern you want. from 1 to x");
        // Storing the user input
        int c = sc.nextInt();

        // Check the option and excuting the corresponding method
        switch (c) {
            case 1:
                one(limit);
                break;

            case 2:
                two(limit);
                break;

            case 3:
                three(limit);
                break;

            case 4:
                four(limit);
                break;

            case 5:
                five(limit);
                break;

            case 6:
                six(limit);
                break;

            case 7:
                seven(limit);
                break;

            // Invalid choice reply
            default:
                System.out.println("Invalid choice");
        }
    }
}