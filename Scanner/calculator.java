import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input two numbers.");
        double n1 = sc.nextDouble(), n2 = sc.nextDouble();

        System.out.println(
                "Choose the mathmatical mathematical operation to do with the provided numbers.\n\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modlus\n6.Power\n7.Root");
        int c = sc.nextInt();

        double result = 0;
        boolean invalid = false;

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

        if (invalid)
            System.out.println("Invalid option was provided");
        else
            System.out.println("Reult is : " + result);
    }
}
