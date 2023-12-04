/**
 * Півоваренко, компмех, завдання 2.5, лаба 5
 * @author pivovarenko
 */
import java.util.ArrayList;
import java.util.List;

public class five2_5 {
    private List<Integer> numbers = new ArrayList<>();
    public void add(int number) {
        numbers.add(number);
    }
    public void remove(int number) {
        numbers.remove(number);
    }
    public int findClosestNumber(int number) {
        int minDiff = Integer.MAX_VALUE;
        int closestNumber = -1;
        for (int n : numbers) {
            int diff = Math.abs(n - number);
            if (diff < minDiff) {
                minDiff = diff;
                closestNumber = n;
            }
        }
        return closestNumber;
    }

    public static void main(String[] args) {
        five2_5 storage = new five2_5();
        storage.add(10);
        storage.add(20);
        storage.add(30);
        int closestNumber = storage.findClosestNumber(15);
        System.out.println("Найближче число до 15: " + closestNumber); 
        storage.remove(20);
        closestNumber = storage.findClosestNumber(15);
        System.out.println("Найближче число до 15 після видалення 20: " + closestNumber); 
    }
}