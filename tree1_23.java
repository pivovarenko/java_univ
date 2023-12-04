/**
 * Півоваренко, компмех, завдання 1.23, лаба 3
 * @author pivovarenko
 */
import java.util.Scanner;

public class tree1_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість пенні (N):");
        int N = scanner.nextInt();
        int[] coins = {50, 10, 5, 1};
        System.out.println("Найкращий спосіб для нарахування " + N + " пенні:");
        for (int coin : coins) {
            int count = N / coin;
            if (count > 0) {
                System.out.println(coin + " коп * " + count);
                N = N % coin; 
            }
        }
        scanner.close();
    }
    
}
