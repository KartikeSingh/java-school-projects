import java.util.Scanner;
class matrix_smallest_largest {
    public static void main(String[] shit) {
        Scanner sc = new Scanner(System.in);
        int length = 3, largest = 0, smallest = 9, sum = 0;

        // Defining an empty matrix / 2d array
        int[][] ar= new int[length][length]; 
        
        System.out.println("Input the 9 elements of the matrix.");

        // Taking user input for filling the 2d array
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                ar[i][j] = sc.nextInt();

                // Adding the sum
                sum += ar[i][j];
                
                // Checking for larget & smallest elements
                if(largest < ar[i][j])largest = ar[i][j];
                if(smallest > ar[i][j])smallest = ar[i][j];
            }   
        }

        // Printing the result
        System.out.println("Smallest Element is " + smallest);
        System.out.println("Largest Element is " + largest);
        System.out.println("Sum of Element is " + sum);
    }
}