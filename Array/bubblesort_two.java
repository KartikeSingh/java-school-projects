class bubblesort_two {
    // The main method
    public static void main(String[] args) {
        // Creating the array
        int[] array = { 3, 5, 0, 9, 2 };

        // Sorting the array
        for (int i = 0; i < array.length; i++) { // Outer loop : for current value's index
            for (int j = i + 1; j < array.length; j++) { // Inner loop : for next value's index
                // Ascending order
                // repalace > to < for descending order
                if (array[i] > array[j]) { // If conditions are true than repalace the variables
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Priniting the sorted array
        System.out.println("Sorted Array : ");
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
