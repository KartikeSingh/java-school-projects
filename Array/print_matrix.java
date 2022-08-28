class matrix {
    public static void main(String[] shit) {
        int length = 3;
        String space = " ";
        // Defining an 2d array with values
        int[][] arr= { {1, 2, 3}, {2, 3, 4}, {0, 9, 8} };

        // Printing the matrix :D
        System.out.println(" _" + space + "_");
        for(int i = 0; i < length; i++) {
            System.out.print("| ");
            for(int j = 0; j < length; j++) {
                System.out.print(arr[i][j]+" ");
            }   
            System.out.print("|");
            System.out.println();
        }
        System.out.println(" _" + space + "_");
    }
}