public class Forr {

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (multiplicityСheck(i)) {
                System.out.println(i);
            }

        }
    }

    public static boolean multiplicityСheck(int i){
        if (i % 4 == 0) {
         return true;
        }
        return false;
    }
}
