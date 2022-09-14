import java.util.Scanner;

class Evil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a whole number, from 2 to 100");

        int n = sc.nextInt(), ones = 0;

        while (n > 0) {
            if (n % 2 == 1)
                ones++;

            n /= 2;

            if (n == 1) {
                ones++;
                break;
            }
        }

        if (ones % 2 == 0)
            System.out.println("Provided numger is a Evil number");
        else
            System.out.println("Provided numger is not a Evil number");
    }
}
