public class Matrix {
    /***
     * Print a matrix
     * @param ar The matrix you want to print
     */
    public static void printMatrix(int[][] ar) {
        int length = ar.length;
        String space = " ";

        space = space.repeat(length * 2 - 1);

        System.out.println(" _" + space + "_");

        for (int i = 0; i < length; i++) {
            System.out.print("| ");

            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + " ");
            }

            System.out.println("|");
        }

        System.out.println(" _" + space + "_");
    }

    /**
     * Horizontally mirror a matrix
     * @param ar The matrix you want to mirror
     */
    public static int[][] mirror_horizontal(int[][] ar) {
        int length = ar.length;

        for (int i = 0; i < length; i++) {
            int downLimit = ar[i].length % 2 == 0 ? ar[i].length / 2 - 1 : ar[i].length / 2;
            for (int j = 0; j <= downLimit; j++) {

                int J = ar[i].length - j - 1;

                int t = ar[i][J];
                ar[i][J] = ar[i][j];
                ar[i][j] = t;
            }
        }

        return ar;
    }

    /**
     * Vertically mirror a matrix
     * @param ar The matrix you want to mirror
     */
    public static int[][] mirror_vertical(int[][] ar) {
        int length = ar.length;

        int upLimit = length % 2 == 0 ? length / 2 - 1 : length / 2;

        for (int i = 0; i <= upLimit; i++) {
            for (int j = 0; j < ar[i].length; j++) {

                int I = length - i - 1;

                int t = ar[I][j];
                ar[I][j] = ar[i][j];
                ar[i][j] = t;
            }
        }

        return ar;
    }

    /**
     * Mirror a matrix both horizontally & vertically
     * @param ar The matrix you want to mirror
     */
    public static int[][] mirror(int[][] ar) {
        return mirror_vertical(mirror_horizontal(ar));
    }

    /**
     * Do a mathmatical operation of two matrixes
     * @param a1 First Matrix
     * @param a2 Second Matrix
     * @param type The operation you want to take
     */
    private static int[][] calc(int[][] a1, int[][] a2, char type) {

        int r = a1.length > a2.length ? a2.length : a1.length;

        for (int i = 0; i < r; i++) {
            int c = a1[i].length > a2[i].length ? a2[i].length : a1[i].length;

            for (int j = 0; j < c; j++) {
                if (type == '+')
                    a1[i][j] += a2[i][j];
                else if (type == '-')
                    a1[i][j] -= a2[i][j];
                else if (type == '*')
                    a1[i][j] *= a2[i][j];
                else if (type == '/')
                    a1[i][j] /= a2[i][j];
                else if (type == '%')
                    a1[i][j] %= a2[i][j];
                else if (type == '^')
                    a1[i][j] = (int) Math.pow(a1[i][j], a2[i][j]);
                else
                    throw new Error("Invalid mathmatical type was provided");
            }
        }

        return a1;
    }

    // Run addition operation on two matrix
    public static int[][] add(int[][] a1, int[][] a2) {
        return calc(a1, a2, '+');
    }

    // Run subtraction operation on two matrix
    public static int[][] subtract(int[][] a1, int[][] a2) {
        return calc(a1, a2, '-');
    }

    // Run muliplication operation on two matrix
    public static int[][] multiply(int[][] a1, int[][] a2) {
        return calc(a1, a2, '*');
    }

    // Run division operation on two matrix
    public static int[][] divide(int[][] a1, int[][] a2) {
        return calc(a1, a2, '/');
    }

    // Take power on first matrix from second matrix
    public static int[][] power(int[][] a1, int[][] a2) {
        return calc(a1, a2, '^');
    }

    Matrix() {
        throw new Error("You are not supposed to make a object of this class, It is only a utility class to perform differenct functions on matrix.");
    }

    public static void main(String[] args) {
        int a[][] = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 6, 7, 8 }
        };

        int a2[][] = {
                { 1, 2, 3 },
                { 3, 4, 5 },
                { 6, 7, 8 }
        };

        System.out.println("Normal Matrix");
        printMatrix(a);

        System.out.println("Sum Of Matrix");
        printMatrix(add(a, a2));

        System.out.println("Difference Of Matrix");
        printMatrix(subtract(a, a2));

        System.out.println("Multiplication Of Matrix");
        printMatrix(multiply(a, a2));

        System.out.println("Division Of Matrix");
        printMatrix(divide(a, a2));

        System.out.println("Mirrored Matrix");
        printMatrix(mirror(a));
    }
}