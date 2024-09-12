// Su-Do-Ku Puzzle – A Sudoku is a problem where there are is an incomplete 9 x 9 table of numbers which must be filled according to
// several rules:
//  Within any of the 9 individual 3 x 3 boxes, each of the numbers 1 to 9 must be found.
//  Within any column of the 9 x 9 grid, each of the numbers 1 to 9 must be found.
//  Within any row of the 9 x 9 grid, each of the numbers 1 to 9 must be found.


public class SudokuSolver {

    static int[][] grid = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    public static void main(String[] args) {
        if (solveSudoku()) {
            System.out.println("Solved Sudoku grid:");
            printGrid();
        } else {
            System.out.println("No solution exists.");
        }
    }

    static boolean isValid(int row, int col, int num) {
        for (int x = 0; x < 9; x++) {
            if (grid[row][x] == num) return false;
        }
        for (int x = 0; x < 9; x++) {
            if (grid[x][col] == num) return false;
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + startRow][j + startCol] == num) return false;
            }
        }
        return true;
    }

    static boolean solveSudoku() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (grid[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(row, col, num)) {
                            grid[row][col] = num;
                            if (solveSudoku()) return true;
                            grid[row][col] = 0; // Backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static void printGrid() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}