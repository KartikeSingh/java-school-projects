import java.util.Scanner;

class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String names[] = { "", "January", "Feburary", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };
        int limits[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        System.out.println("Input the date");
        int d = sc.nextInt();

        System.out.println("Input the month");
        int m = sc.nextInt();

        System.out.println("Input the year");
        int y = sc.nextInt();

        if (y % 4 == 0)
            limits[2] = 29;

        if (m > 12 || d > limits[m]) {
            System.out.println("Invalid Date");
            return;
        }

        System.out.println("How many days you want to add?");
        int n = sc.nextInt();

        int d1 = 1, m1 = 1, y1 = y;

        for (int i = 1; i < m; i++)
            n += limits[i];
        n += d;

        while (n > 0) {
            if (y1 % 4 == 0)
                limits[2] = 29;
            else
                limits[2] = 28;

            while (m1 < 12 && n > limits[m1]) {
                n -= limits[m1];
                m1++;
            }

            if (m1 >= 12 && n > limits[12]) {
                y1++;
                n -= limits[12];
                m1 = 1;
            } else {
                d1 = n;
                break;
            }
        }

        System.out.println(names[m1] + " " + d1 + ", " + y1);
    }
}
