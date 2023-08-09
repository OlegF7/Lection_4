import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        ArrayList<Integer> multiplesOfFour = findMultiplesOfFour();
        for (int i = multiplesOfFour.size() - 1; i >= 0; i--) {
            System.out.println(multiplesOfFour.get(i));
        }
    }
    public static ArrayList<Integer> findMultiplesOfFour() {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 100; i >= 1; i--) {
            if (isMultipleOfFour(i)) {
                result.add(i);
            }
        }
        return result;
    }
    public static boolean isMultipleOfFour(int num) {
        if (num % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}