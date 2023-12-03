/**
 * Півоваренко, компмех, завдання 4.5, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть координати точки A (через пробіл):");
        double ax = scanner.nextDouble();
        double ay = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введіть координати точки B (через пробіл):");
        double bx = scanner.nextDouble();
        double by = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Введіть координати точки C (через пробіл):");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();
        double sideAB = calculateDistance(ax, ay, bx, by);
        double sideBC = calculateDistance(bx, by, cx, cy);
        double sideCA = calculateDistance(cx, cy, ax, ay);
        double triangleArea = calculateTriangleArea(sideAB, sideBC, sideCA);
        System.out.printf("Площа трикутника: %.4f%n", triangleArea);
        scanner.close();
    }
    private static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    private static double calculateTriangleArea(double sideAB, double sideBC, double sideCA) {
        double s = (sideAB + sideBC + sideCA) / 2; 
        return Math.sqrt(s * (s - sideAB) * (s - sideBC) * (s - sideCA));
    }
    
}
