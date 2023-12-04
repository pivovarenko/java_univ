/**
 * Півоваренко, компмех, завдання 3.10, лаба 4
 * @author pivovarenko
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class four3_10 {
    private double a, b, c;
    public four3_10(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Point getIntersectionWithXAxis() {
        return new Point(-c / a, 0);
    }
    public Point getIntersectionWithYAxis() {
        return new Point(0, -c / b);
    }
    public Point getIntersectionWith(four3_10 other) {
        double denominator = a * other.b - b * other.a;
        if (denominator == 0) {
            return null;
        }
        double x = (other.b * c - b * other.c) / denominator;
        double y = (a * other.c - other.a * c) / denominator;
        return new Point(x, y);
    }
    public static class Point {
        private double x, y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
    public static void main(String[] args) {
        four3_10 a = new four3_10(1, 2, 3);
        four3_10 b = new four3_10(2, 3, 4);
        four3_10 c = new four3_10(3, 4, 5);
        Point xAxisIntersectionA = a.getIntersectionWithXAxis();
        System.out.println("Перетин прямої A з віссю X: " + xAxisIntersectionA); 
        Point yAxisIntersectionA = a.getIntersectionWithYAxis();
        System.out.println("Перетин прямої A з віссю Y: " + yAxisIntersectionA); 
        Point intersectionAB = a.getIntersectionWith(b);
        System.out.println("Перетин прямих A і B: " + intersectionAB); 
        List<four3_10> lines = new ArrayList<>();
        lines.add(a);
        lines.add(b);
        lines.add(c);
        Collections.sort(lines, (o1, o2) -> {
            if (o1.a > o2.a) {
                return 1;
            } else if (o1.a < o2.a) {
                return -1;
            } else {
                return 0;
            }
        });
        List<List<four3_10>> parallelLines = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            List<four3_10> parallelLine = new ArrayList<>();
            for (int j = i + 1; j < lines.size(); j++) {
                if (lines.get(i).a == lines.get(j).a && lines.get(i).b == lines.get(j).b) {
                    parallelLine.add(lines.get(i));
                    parallelLine.add(lines.get(j));
                }
            }
            if (parallelLine.size() > 0) {
                parallelLines.add(parallelLine);
            }
        }

        for (List<four3_10> parallelLine : parallelLines) {
            System.out.println("Група паралельних прямих: " + parallelLine);
        }
    }
}
