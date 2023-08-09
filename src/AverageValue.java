import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int start = scanner.nextInt();

        System.out.println("Введите конечное число диапазона: ");
        int end = scanner.nextInt();

        // Вычисляем среднее арифметическое всех чисел
        int sumAll = 0;
        int countAll = 0;

        for (int i = start; i <= end; i++) {
            sumAll += i;
            countAll++;
        }

        double averageAll = (double) sumAll / countAll;

        System.out.println("Среднее арифметическое всех чисел: " + averageAll);

        // Вычисляем среднее арифметическое только четных чисел
        int sumEven = 0;
        int countEven = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i;
                countEven++;
            }
        }

        double averageEven = (double) sumEven / countEven;

        System.out.println("Среднее арифметическое четных чисел: " + averageEven);
    }
}
