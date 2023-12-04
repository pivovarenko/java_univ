/**
 * Півоваренко, компмех, завдання 2.2, лаба 3
 * @author pivovarenko
 */
import java.util.Arrays;

public class tree2_2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Оригінальна матриця:");
        printMatrix(matrix);
        int k = 2; 
        cyclicallyShiftMatrix(matrix, k, "right");
        System.out.println("\nМатриця після циклічного зсуву вправо:");
        printMatrix(matrix);
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static void cyclicallyShiftMatrix(int[][] matrix, int k, String direction) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                switch (direction) {
                    case "right":
                        result[i][(j + k) % cols] = matrix[i][j];
                        break;                }
            }
        }
        for (int i = 0; i < rows; i++) {
            System.arraycopy(result[i], 0, matrix[i], 0, cols);
        }
    }
}
