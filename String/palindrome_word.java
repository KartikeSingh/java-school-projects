// Importing the Scanner class
import java.util.Scanner;

class palindrome_word {
    public static void main(String[] args) {
        // Defining the scanner class to get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string to check if it is a plaindrome word.");
        // Storing the user input
        String word = sc.next(), reverse = "";

        // Reversing the word
        for(int i = word.length() - 1 ; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        // Printing the result
        if(word.equals(reverse)) System.out.println("The provided word is a plaindrome word");
        else System.out.println("The provided word is not a plaindrome word");
    }
}