class insertionSort {
    public static void main(String[] args) {
        int[] ar = { 3, 45, 1, 34, 90, 75, 2, 545, 7 };

        for (int i = 1; i < ar.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (ar[j + 1] > ar[j]) {
                    int t = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = t;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < ar.length; i++)
            System.out.print(ar[i] + " ");
    }
}
