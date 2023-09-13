import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        char c = '7';
        int s = Integer.parseInt(String.valueOf(c));
        System.out.println(s);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");

        int number = scan.nextInt();
        boolean otr = false;
        if (number < 0) otr = true;те

        String numberStr = String.valueOf(number);
        int[] numbers = null;
        char[] chars = numberStr.toCharArray();

        if (otr) {
            numbers = new int[numberStr.length() - 1];
            for (int i = 1, j = 0; i < chars.length; i++, j++) {
                if (i == 1) {
                    numbers[j] = -Integer.parseInt(String.valueOf(chars[i]));
                } else {
                    numbers[j] = Integer.parseInt(chars[i] + "");
                }
            }

        } else {
            numbers = new int[numberStr.length()];
            for (int i = 0; i < chars.length; i++) {
                numbers[i] = Integer.parseInt(String.valueOf(chars[i]));
            }
        }

        int sum = 0;
        int sumOfOddNumbers = 0;
        int maxDigit = numbers[0];
        for (int i : numbers) {
            sum += i;
            if (i % 2 != 0) {
                sumOfOddNumbers += i;
            }
            if (i > maxDigit) {
                maxDigit = i;
            }
        }

        System.out.println("Сумма цифр числа: " + sum);
        System.out.println("Сумма нечетных цифр числа: " + sumOfOddNumbers);
        System.out.println("Максимальная цифра числа: " + maxDigit);
    }
}
