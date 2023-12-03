import java.util.Scanner;

public class one1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть аргумент ");
        String n = scanner.nextLine();
        System.out.print("Введіть аргумент ");
        long p = scanner.nextLong();
        System.out.print("Введіть аргумент ");
        long g = scanner.nextLong();
        System.out.println("Перший аргумент:" + n );
        System.out.println("Другий аргумент:" + p );
        System.out.println("Третій аргумент:" + g );
        scanner.close();
    }
}
