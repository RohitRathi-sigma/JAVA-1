//WAP to print jagged array for given values.
public class jaggedArray {
    public static void main(String[] args) {
        // Declaring a jagged array with 3 rows
        int[][] jaggedArray = new int[3][];

        // Initializing the subarrays with different lengths
        jaggedArray[0] = new int[3]; // First row with 3 elements
        jaggedArray[1] = new int[4]; // Second row with 4 elements
        jaggedArray[2] = new int[2]; // Third row with 2 elements

        // Assigning values to the jagged array
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[0][2] = 3;

        jaggedArray[1][0] = 4;
        jaggedArray[1][1] = 5;
        jaggedArray[1][2] = 6;
        jaggedArray[1][3] = 7;

        jaggedArray[2][0] = 8;
        jaggedArray[2][1] = 9;

        // Printing the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}