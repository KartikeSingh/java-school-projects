import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input your full name");
        String name = sc.nextLine();

        System.out.println("Input your age");
        int age = sc.nextInt(), left = 18 - age;

        if (age < 18) {
            System.out.println(name + " you are too young to vote, try again after " + left + " years");
            return;
        }

        System.out.println("Who do you want to vote for ?\nA\nB\nC\nD");
        char voteTo = Character.toUpperCase(sc.next().charAt(0));

        if (voteTo != 'A' && voteTo != 'B' && voteTo != 'C' && voteTo != 'D') {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("You successfully voted for " + voteTo);
    }
}
