//WAp to print a jagged array taking input from user.
import java.util.Scanner;

public class jaggedArrayInputFromUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Declaring the jagged array
        int[][] jaggedArray = new int[rows][];

        // Taking input for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of columns for row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];

            // Taking input for each element in the row
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Printing the jagged array
        System.out.println("The jagged array is: ");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}