import java.util.Scanner;

class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the value of M (> 0) then N (> 2)");

        int m = sc.nextInt(), n = sc.nextInt(), ar[][] = new int[m][n];

        System.out.println("Input " + (m * n) + " Integers, It should be from 0 to 7");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            int d = 0;
            for (int j = 0; j < n; j++) {
                d += ar[i][j] * Math.pow(8, n - j - 1);
                System.out.print(ar[i][j] + "\t");
            }
            System.out.println(d);
        }
    }
}
