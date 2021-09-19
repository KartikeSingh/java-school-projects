import java.util.Scanner;

class calculator {
    public static void main(String[] args) {
        // Defining the scanner class to get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Input two numbers.");
        // Storing the user input
        double n1 = sc.nextDouble(), n2 = sc.nextDouble();

        System.out.println(
                "Choose the mathmatical mathematical operation to do with the provided numbers.\n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modlus\n6.Power\n7.Root");
        // Defining the scanner class to get user input
        // Storing the user input
        int c = sc.nextInt();

        double result = 0;
        boolean invalid = false;

        // Check the option and doing the mathmatical operation accordingly
        if (c == 1)
            result = n1 + n2;
        else if (c == 2)
            result = n1 - n2;
        else if (c == 3)
            result = n1 * n2;
        else if (c == 4)
            result = n1 / n2;
        else if (c == 5)
            result = n1 % n2;
        else if (c == 6)
            result = Math.pow(n1, n2);
        else if (c == 7)
            result = Math.pow(n1, -n2);
        else
            invalid = true;

        // Printing invalid result message
        if (invalid)
            System.out.println("Invalid option was provided");
        // Printing the result
        else
            System.out.println("Reult is : " + result);
    }
}