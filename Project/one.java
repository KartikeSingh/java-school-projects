import java.util.Scanner;

class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the N, then 3 characters");

        int n = sc.nextInt();
        char a = sc.next().charAt(0),
                b = sc.next().charAt(0),
                c = sc.next().charAt(0);

        char[][] ar = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if ((i == 0 || i == n - 1) && (j == 0 || j == n - 1))
                    ar[i][j] = a;
                else if (((i == 0 || i == n - 1) && (j != 0 && j != n - 1))
                        || ((j == 0 || j == n - 1) && (i != 0 && i != n - 1)))
                    ar[i][j] = b;
                else
                    ar[i][j] = c;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
