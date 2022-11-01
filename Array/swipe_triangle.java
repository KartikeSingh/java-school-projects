import java.util.Scanner;

class swipe_triangle {
    static void left(int[][] ar) {
        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = t;
            }
        }

        System.out.println("Left Diagonal, Swapped Triangles, Matrix");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
    }

    static void right(int[][] ar) {
        int n = ar.length;

        for (int i = n - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                int t = ar[i][j];
                ar[i][j] = ar[n - i - 1][n - j - 1];
                ar[n - i - 1][n - j - 1] = t;
            }
        }

        System.out.println("Right Diagonal, Swapped Triangles, Matrix");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the value of n");

        int n = sc.nextInt();

        System.out.println("Input " + (n * n) + " integers");

        int ar[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                ar[i][j] = sc.nextInt();

        System.out.println("Orignal Matrix");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(ar[i][j] + " ");
            System.out.println();
        }
    }
}
