import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number to get its factorial");
        int n = sc.nextInt(), factorial = 1;
        int number = n;

        while (n > 0) {
            factorial *= n;
            n--;
        }

        System.out.println("Factorial of " + number + " is : " + factorial);
    }
}
