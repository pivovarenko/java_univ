/**
 * Півоваренко, компмех, завдання 2.1, лаба 3
 * @author pivovarenko
 */
import java.util.Arrays;

public class tree2_1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 3, 9, 1},
            {8, 3, 6, 4},
            {2, 0, 11, 2}
        };
        System.out.println("Оригінальна матриця:");
        printMatrix(matrix);
        sortMatrixRows(matrix);
        System.out.println("\nМатриця після сортування рядків:");
        printMatrix(matrix);
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
    private static void sortMatrixRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
    }
}
