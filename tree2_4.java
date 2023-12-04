/**
 * Півоваренко, компмех, завдання 2.4, лаба 3
 * @author pivovarenko
 */
public class tree2_4 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, -2, 3, -4, 5},
            {6, -7, 8, -9, 10},
            {11, 12, -13, -14, 15},
            {-16, 17, -18, 19, -20}
        };
        int[] result = findSumBetweenPositives(matrix);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Сума між першим і другим додатними елементами у рядку " + (i + 1) + ": " + result[i]);
        }
    }
    private static int[] findSumBetweenPositives(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows];
        for (int i = 0; i < rows; i++) {
            int firstPositiveIndex = -1;
            int secondPositiveIndex = -1;
            int currentSum = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > 0) {
                    if (firstPositiveIndex == -1) {
                        firstPositiveIndex = j;
                    } else {
                        secondPositiveIndex = j;
                        break;
                    }
                }
            }
            if (firstPositiveIndex != -1 && secondPositiveIndex != -1) {
                for (int j = firstPositiveIndex + 1; j < secondPositiveIndex; j++) {
                    currentSum += matrix[i][j];
                }
            }
            result[i] = currentSum;
        }
        return result;
    }
    
}
