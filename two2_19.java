/**
 * Півоваренко, компмех, завдання 2.19, лаба 2
 * @author pivovarenko
 */
import java.util.Scanner;

public class two2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число N: ");
        long N = scanner.nextLong();
        long result = addControlBits(N);
        System.out.println("Результат у форматі з контрольним бітом: " + result);
        long N28 = convertTo28Bits(result);
        if (N28 != -1) {
            System.out.println("28-бітне число: " + N28);
        } else {
            System.out.println("Контрольний біт некоректний на якомусь байті.");
        }
        scanner.close();
    }
    private static long addControlBits(long N) {
        long result = 0;
        long mask = 1;
        for (int i = 0; i < 32; i += 7) {
            long sevenBits = (N >> i) & 0x7F;  
            long controlBit = calculateControlBit(sevenBits);  
            result |= (sevenBits << i) | (controlBit << (i + 7));  
        }

        return result;
    }
    private static long calculateControlBit(long sevenBits) {
        long sum = 0;
        while (sevenBits > 0) {
            sum += sevenBits % 2;
            sevenBits /= 2;
        }
        return sum % 2;
    }
    private static long convertTo28Bits(long N) {
        long result = 0;
        long mask = 0x0FFFFFFF;  
        for (int i = 0; i < 32; i += 8) {
            long sevenBits = (N >> i) & 0xFF;
            long controlBit = (N >> (i + 7)) & 0x1;
            long calculatedControlBit = calculateControlBit(sevenBits);
            if (controlBit != calculatedControlBit) {
                return -1;
            }
            result |= ((sevenBits << i) & mask);
        }
        return result;
    }    
}
