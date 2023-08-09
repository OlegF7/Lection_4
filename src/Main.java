import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        String name = "";
        int i = 0; // переменная для отслеживания количества попыток
        while (repeat && i < 3) {
            System.out.print("Привет! Как тебя зовут? ");
            String a = scan.nextLine();
            int a1 = a.length();
            if (a1 != 0) {
                System.out.printf("Привет! %s", a);
                name = a;
                repeat = false; // Команда для выхода из цикла
            } else {
                System.out.println("Почему вы не ввели имя?");
                i++; // увеличиваем счетчик попыток
            }
        }
        System.out.println("\nПока " + name + " больше сюда не пиши.");
        scan.close();
    }
}