// Importing the Scanner class
import java.util.Scanner;

class piglatin {
    public static void main(String[] args) {
        // Defining the scanner class to get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the string to convert it to it's Pig Latin form.");
        // Storing the user input
        String word = sc.next();
        int i = 0;

        // Reversing the word
        for(; i < word.length(); i++) {
            char c = Character.toLowerCase(word.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') break;
        }

        // Printing the result
        System.out.println("The Pig Latin form of this provided word is : "+ word.substring(i) + word.substring(0,i) + "ay");
    }
}