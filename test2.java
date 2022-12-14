public class test2 {

    public static boolean prime(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int count = 0;

        for (int i = 2; i < 100; i++) {

            if (prime(i)) {
                if (count % 2 == 0) {
                    System.out.println(i);
                }

                count++;
            }

        }
        System.out.println(count);
    }

}
