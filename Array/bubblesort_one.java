// Importing the scanner Class
import java.util.Scanner;

class bubblesort_one {
    // The main method
    public static void main(String[] args) {
        // Creating the scanner object to take unputs
        Scanner sc = new Scanner(System.in);

        // Asking for the length of the array
        System.out.println("Input the length of the array");
        // Storing the length of the array
        int length = sc.nextInt();

        // Creating the array
        int[] array = new int[length];

        // Taking the values of the array
        for (int i = 0; i < length; i++) {
            System.out.println("Input the next number of the array.");
            array[i] = sc.nextInt();
        }

        // Sorting the array
        for (int i = 0; i < length; i++) { // Outer loop : for current value's index
            for (int j = i + 1; j < length; j++) { // Inner loop : for next value's index
                // Ascending order
                // repalace > to < for descending order
                if (array[i] > array[j]) { // If conditions are true than repalace the variables
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Priniting the sorted array
        System.out.println("Sorted Array : ");
        for (int i = 0; i < length; i++)
            System.out.println(array[i]);
    }
}
