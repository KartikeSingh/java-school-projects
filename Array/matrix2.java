import java.util.Scanner;
class matrix2 {
    public static void main(String[] shit) {
        Scanner sc = new Scanner(System.in);
        int length = 3;
        String space = " ";
        space = space.repeat(length * 2 - 2);
        
        // Defining an empty matrix / 2d array
        int[][] ar= new int[length][length]; 
        // Defining an 2d array with values
        int[][] arr= {{1, 2, 3}, {2, 3, 4}, {0, 9, 8}};

        System.out.println("Input the 9 elements of the matrix.");

        // Taking user input for filling the 2d array
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                ar[i][j] = sc.nextInt();
            }   
        }

        printMatrix(ar, length, space);
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