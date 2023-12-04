/**
 * Півоваренко, компмех, завдання 2.3, лаба 3
 * @author pivovarenko
 */
public class tree2_3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 5},
            {1, 2, 3, 4},
            {4, 6, 7, 8},
            {2, 3, 1, 5}
        };
        int result = findLongestIncreasingSequence(matrix);
        System.out.println("Найбільше число зростаючих елементів матриці, що йдуть підряд: " + result);
    }
    private static int findLongestIncreasingSequence(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxLength = 1; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentLength = findIncreasingSequence(matrix, i, j);
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }
    private static int findIncreasingSequence(int[][] matrix, int row, int col) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int currentLength = 1;
        int currentValue = matrix[row][col];
        for (int i = row; i < rows; i++) {
            for (int j = col + 1; j < cols; j++) {
                if (matrix[i][j] == currentValue + 1) {
                    currentLength++;
                    currentValue = matrix[i][j];
                } else {
                    return currentLength;
                }
            }
        }
        return currentLength;
    }
}
