/**
 * Півоваренко, компмех, завдання 2.12, лаба 3
 * @author pivovarenko
 */
import java.util.Arrays;

public class tree2_12 {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 7, 2, 8},
            {5, 1, 9, 4},
            {6, 12, 10, 11},
            {15, 14, 13, 16}
        };
        int targetRow = 2; 
        int targetCol = 1; 
        moveMinElement(matrix, targetRow, targetCol);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static void moveMinElement(int[][] matrix, int targetRow, int targetCol) {
        int minRow = 0;
        int minCol = 0;
        int minValue = matrix[minRow][minCol];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }
        int[] tempRow = matrix[minRow];
        matrix[minRow] = matrix[targetRow];
        matrix[targetRow] = tempRow;
        for (int i = 0; i < matrix.length; i++) {
            int tempValue = matrix[i][minCol];
            matrix[i][minCol] = matrix[i][targetCol];
            matrix[i][targetCol] = tempValue;
        }
    }    
}
