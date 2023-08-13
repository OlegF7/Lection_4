public class Forr {

    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            multiplicityСheck(i);
        }
    }

    public static void multiplicityСheck(int i){
        if (i % 4 == 0) {
            System.out.println(i);
        }
    }



}
