import java.util.Scanner;
class mirror_matrix {
    public static void main(String[] shit) {
        Scanner sc = new Scanner(System.in);
        int length = 3;
        String space = " ";
        space = space.repeat(length * 2 - 2);
        
        // Defining an empty matrix / 2d array
        int[][] ar = new int[length][length]; 
        int[][] ar2 = new int[length][length]; 
 
        System.out.println("Input the " + length * length + " elements of the matrix.");

        // Taking user input for filling the 2d array
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                ar[i][j] = sc.nextInt();

                int J = j == length / 2 ? j : j >= length / 2 ? ( j / 2 ) - 1 : length - j - 1;
                int I = i == length / 2 ? i : i >= length / 2 ? ( i / 2 ) - 1 : length - i - 1;

                ar2[I][J] = ar[i][j];
            }   
        }

        // Printing the provided matrix
        printMatrix(ar, length, space);

        // Printing the mirror matrix
        printMatrix(ar2, length, space);
    }

    public static void printMatrix(int[][] ar, int length, String space) {
        System.out.println(" _" + space + "_");
        for(int i = 0; i < length; i++) {
            System.out.print("| ");
            for(int j = 0; j < length; j++) {
                System.out.print(ar[i][j]+" ");
            }   
            System.out.print("|");
            System.out.println();
        }
        System.out.println(" _" + space + "_");
    }
}