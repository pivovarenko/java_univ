/**
 * Півоваренко, компмех, завдання 1.24, лаба 3
 * @author pivovarenko
 */
import java.util.Scanner;

public class tree1_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість предметів та максимальну вагу рюкзака:");
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int[] weights = new int[N];
        System.out.println("Введіть ваги предметів:");
        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }
        int maxWeight = knapsack(N, W, weights);
        System.out.println("Максимальна сумарна вага предметів: " + maxWeight);
        scanner.close();
    }
    private static int knapsack(int n, int w, int[] weights) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (weights[n - 1] > w) {
            return knapsack(n - 1, w, weights);
        }
        return Math.max(weights[n - 1] + knapsack(n - 1, w - weights[n - 1], weights),
                        knapsack(n - 1, w, weights));
    }
    
}
