/**
 * Півоваренко, компмех, завдання 3.8, лаба 2
 * @author pivovarenko
 */
import java.util.Scanner;

public class two3_8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число в межах -999,999,999 до 999,999,999: ");
        int number = scanner.nextInt();
        if (number < -999999999 || number > 999999999) {
            System.out.println("Введене число не знаходиться в межах визначеного діапазону.");
        } else {
            String result = convertToEnglish(number);
            System.out.println(result);
        }
        scanner.close();
    }
    private static String convertToEnglish(int number) {
        if (number == 0) {
            return "нуль";
        } else if (number < 0) {
            return "мінус " + convertToEnglish(-number);
        }
        String[] units = {"", "один", "два", "три", "чотири", "п'ять", "шість", "сім", "вісім", "дев'ять"};
        String[] teens = {"", "одинадцять", "дванадцять", "тринадцять", "чотирнадцять", "п'ятнадцять", "шістнадцять", "сімнадцять", "вісімнадцять", "дев'ятнадцять"};
        String[] tens = {"", "десять", "двадцять", "тридцять", "сорок", "п'ятдесят", "шістдесят", "сімдесят", "вісімдесят", "дев'яносто"};
        String[] thousands = {"", "тисяча", "мільйон"};
        String result = "";
        for (int i = 0; number > 0; i++, number /= 1000) {
            if (number % 1000 != 0) {
                result = convertChunk(number % 1000, units, teens, tens) + " " + thousands[i] + " " + result;
            }
        }
        return result.trim();
    }
    private static String convertChunk(int number, String[] units, String[] teens, String[] tens) {
        String result = "";
        if (number >= 100) {
            result += units[number / 100] + " сто ";
            number %= 100;
        }
        if (number >= 11 && number <= 19) {
            result += teens[number - 11] + " ";
        } else if (number >= 20) {
            result += tens[number / 10] + " ";
            number %= 10;
        }
        if (number >= 1 && number <= 9) {
            result += units[number] + " ";
        }
        return result;
    }
}
