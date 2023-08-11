import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scan.nextInt();
        int sumOfNumbers = 0;
        int sumOfOddNumbers = 0;
        int maxDigitNumbers = 0;
        int currentDigit;

        while (number != 0) {
            currentDigit = number % 10;
            sumOfNumbers += currentDigit;

            if (currentDigit % 2 != 0) {
                sumOfOddNumbers += currentDigit;
            }

            if (currentDigit > maxDigitNumbers) {
                maxDigitNumbers = currentDigit;
            }

            number /= 10;
        }

        System.out.println("Сумма цифр числа: " + sumOfNumbers);
        System.out.println("Сумма нечетных цифр числа: " + sumOfOddNumbers);
        System.out.println("Максимальная цифра числа: " + maxDigitNumbers);
    }
}

