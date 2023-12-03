/**
 * Півоваренко, компмех, завдання 4.2, лаба 2
 * @author pivovarenko
 */
import java.time.DayOfWeek;
import java.time.LocalDate;

public class two4_2 {
    public static void main(String[] args) {
        int maxDaysWithoutFriday13th = findMaxDaysWithoutFriday13th();
        System.out.println("Максимальна кількість днів без п'ятниці 13-го: " + maxDaysWithoutFriday13th);
    }
    private static int findMaxDaysWithoutFriday13th() {
        int maxDays = 0;
        int daysWithoutFriday13th = 0;
        for (int year = 1900; year < 2300; year++) {
            for (int month = 1; month <= 12; month++) {
                LocalDate date = LocalDate.of(year, month, 13);
                if (date.getDayOfWeek() != DayOfWeek.FRIDAY) {
                    daysWithoutFriday13th++;
                } else {
                    maxDays = Math.max(maxDays, daysWithoutFriday13th);
                    daysWithoutFriday13th = 0;
                }
            }
        }
        return maxDays;
    }
    
}
