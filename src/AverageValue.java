import java.util.Scanner;
public class AverageValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int start = scanner.nextInt();

        System.out.println("Введите конечное число диапазона: ");
        int end = scanner.nextInt();

        // Вычисляем среднее арифметическое четных чисел
        int sumAll = 0;
        int countAll = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0)
                sumAll += i;
                countAll++;
        }

        double averageAll = (double) sumAll / countAll;

        System.out.printf("Среднее арифметическое четных чисел: " + "%.1f", averageAll);
    }
}
