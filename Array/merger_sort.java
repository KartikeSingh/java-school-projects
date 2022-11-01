import java.util.Scanner;

class merger_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[4], b[] = new int[6], c[] = new int[a.length + b.length];

        System.out.println("Input " + a.length + " integrs for first array\nThen input " + b.length
                + " integers for second array");

        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < b.length; i++)
            b[i] = sc.nextInt();

        int ai = 0, bi = 0, ci = 0;

        // Ascending order
        while (ai < a.length && bi < b.length) {
            if (a[ai] < b[ai]) {
                c[ci] = a[ai];
                ci++;
                ai++;
            } else if (a[ai] > b[ai]) {
                c[ci] = b[bi];
                ci++;
                bi++;
            } else {
                c[ci] = b[bi];
                ci++;
                ai++;
                bi++;
            }
        }

        while(ai < a.length) {
            c[ci] = a [ai];
            ci++;
            ai++;
        }

        while(bi < b.length) {
            c[ci] = b [bi];
            ci++;
            bi++;
        }

        for(int i =0;i<ci;i++) {
            System.out.print(c[i]+ " ");
        }
    }
}
