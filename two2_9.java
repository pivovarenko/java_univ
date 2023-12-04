import java.util.Scanner;

/**
 * Півоваренко, компмех, завдання 2.9, лаба 2
 * @author pivovarenko
 */
public class two2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довге натуральне число m: ");
        long m = scanner.nextLong();
        System.out.print("Введіть натуральне число k: ");
        int k = scanner.nextInt();
        int kthBit = findKthBit(m, k);
        System.out.println("k-тий розряд числа m: " + kthBit);
        scanner.close();
    }
    private static int findKthBit(long m, int k) {
        return (int) ((m >> (k - 1)) & 1);
    }
}
