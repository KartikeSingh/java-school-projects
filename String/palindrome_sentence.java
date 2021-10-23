// Importing the Scanner class
import java.util.Scanner;

class palindrome_word {
    // Checking if the word is a palindrome word
    public static boolean isPalindrome(String word) {
        if(word.length() < 2)return false;

        String reverse = "";

        for(int i = word.length() - 1 ; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        return word.equals(reverse);
    }

    // The main function
    public static void main(String[] shit) {
        // Defining the scanner class to get user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the sentence to check for plaindrome words.");
        // Storing the user input
        String sentence = sc.nextLine(), word = "", result = "";

        // Getting the words from the sentence
        for(int i = 0; i < sentence.length() - 1; i++) {
            word += sentence.charAt(i);
            
            // If the word is completed the check if it is palindrome
            if(sentence.charAt(i + 1) == ' ') {
                System.out.println(word);
                if(isPalindrome(word))result += word + " ";
                word = "";
                i++;
            }
        }

        // Printing the result
        if(result == "") System.out.println("There are no palindrome words in the sentence");
        else System.out.println("The list of palindrome words :\n");
        System.out.println(result);
    }
}