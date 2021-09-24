
// Importing the Scanner class
import java.util.Scanner;

public class student_one {
    public static void main(String[] args) {
        // Creating the scanner object to take unputs
        Scanner sc = new Scanner(System.in);

        // The number of students
        int students = 30;

        // The number of rankers to show
        int show = 10;

        // Array of Student names and percantage
        double[] percantage = new double[students];
        String[] names = new String[students];

        // Getting the student details
        for (int i = 0; i < students; i++) {
            // Finding the user Index
            int index = i + 1;

            // Storing the user input
            System.out.println("Input the " + index + " Student's name than percantage");
            names[i] = sc.nextLine();
            percantage[i] = sc.nextDouble();

            // removing the useless inputs
            sc.nextLine();
        }

        // Sorting the students in descending order
        for (int i = 0; i < students; i++) {
            for (int j = i + 1; j < students; j++) {
                // If condition is true than swap the element
                if (percantage[i] < percantage[j]) {
                    double temp = percantage[i];
                    String temp2 = names[i];

                    percantage[i] = percantage[j];
                    percantage[j] = temp;
                    names[i] = names[j];
                    names[j] = temp2;
                }
            }
        }

        // Printing the top rankers
        System.out.println("The top rankers");
        System.out.println("Rank\tName\tPercantage");
        for (int i = 0; i < show; i++) {
            int rank = i + 1;
            System.out.println(rank + ".\t" + names[i] + "\t" + percantage[i]);
        }
    }
}
