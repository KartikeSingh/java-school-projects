import java.util.Scanner;
class vertical_mirror_matrix {
    public static void main(String[] shit) {
        Scanner sc = new Scanner(System.in);
        int length = 3;
        // Defining an empty matrix / 2d array
        int[][] ar = new int[length][length]; 
        int[][] ar2 = new int[length][length]; 
 
        System.out.println("Input the 9 elements of the matrix.");

        // Taking user input for filling the 2d array
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                ar[i][j] = sc.nextInt();

                int I = i == 0 ? 2 : i == 2 ? 0 : i;
                ar2[I][j] = ar[i][j];
            }   
        }

        // Printing the provided matrix
        System.out.println(" _      _");
        for(int i = 0; i < length; i++) {
            System.out.print("| ");
            for(int j = 0; j < length; j++) {
                System.out.print(ar[i][j]+" ");
            }   
            System.out.print(" |");
            System.out.println();
        }
        System.out.println(" _      _\n");

        // Printing the mirror matrix
        System.out.println(" _      _");
        for(int i = 0; i < length; i++) {
            System.out.print("| ");
            for(int j = 0; j < length; j++) {
                System.out.print(ar2[i][j]+" ");
            }   
            System.out.print(" |");
            System.out.println();
        }
        System.out.println(" _      _\n");
    }
}