public class even {
    public static void isEven(int n) {
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] argos) {
        int n = 100;
        isEven(n);
    }
}
