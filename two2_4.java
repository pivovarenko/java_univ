
/**
 * Півоваренко, компмех, завдання 2.4, лаба 2
 * @author pivovarenko
 */import java.util.Scanner;

public class two2_4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число n: ");
        int n = scanner.nextInt();
        System.out.print("Введіть ціле число m: ");
        int m = scanner.nextInt();
        int result = toggleBit(n, m);
        System.out.println("Результат: " + result);
        scanner.close();
    }
    private static int toggleBit(int n, int m) {
        return n ^ (1 << m);
    }
    
}
