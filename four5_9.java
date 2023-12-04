/**
 * Півоваренко, компмех, завдання 5.9, лаба 4
 * @author pivovarenko
 */
import java.util.Scanner;
public class four5_9 {
    private Point center;
    private double radius;
    public four5_9(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public boolean contains(Point point) {
        double distance = point.distanceTo(center);
        return distance <= radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть координати центру кола x, y: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Point center = new Point(x, y);
        System.out.print("Введіть радіус кола: ");
        double radius = scanner.nextDouble();
        four5_9 circle = new four5_9(center, radius);
        System.out.print("Введіть координати точки x, y: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        Point point = new Point(x, y);
        boolean contains = circle.contains(point);
        if (contains) {
            System.out.println("Точка (" + x + ", " + y + ") належить колу");
        } else {
            System.out.println("Точка (" + x + ", " + y + ") не належить колу");
        }
    }
}