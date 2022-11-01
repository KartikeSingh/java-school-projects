import java.util.Scanner;

class matrix_triangle {
    static void leftUp(int[][] ar) {
        System.out.println("Left Diagonal, Up Triangle");

        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i <= j)
                    System.out.print(ar[i][j] + " ");
                else
                    System.out.print("  ");

            System.out.println();
        }
    }

    static void leftDown(int[][] ar) {
        System.out.println("Left Diagonal, Down Triangle");

        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i >= j)
                    System.out.print(ar[i][j] + " ");
                else
                    System.out.print("  ");

            System.out.println();
        }
    }

    static void rightUp(int[][] ar) {
        System.out.println("Right Diagonal, Up Triangle");

        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i + j >= n - 1)
                    System.out.print(ar[i][j] + " ");
                else
                    System.out.print("  ");

            System.out.println();
        }
    }

    static void rightDown(int[][] ar) {
        System.out.println("Right Diagonal, Down Triangle");

        int n = ar.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (i + j <= n - 1)
                    System.out.print(ar[i][j] + " ");
                else
                    System.out.print("  ");

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

        leftUp(ar);
        leftDown(ar);
        rightUp(ar);
        rightDown(ar);
    }
}
