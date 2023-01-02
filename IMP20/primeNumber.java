package IMP20;

public class primeNumber {

    public static boolean checkPrime(int in) {
        for (int i = 2; i < in / 2; i++) {
            if (in % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int n = 100;
        int count = 0;
        int ctadev = 0;
        for (int i = 1; i <= n; i++) {
            if (checkPrime(i)) {
                // Print prime one by one
                if (count % 2 == 0) {
                    System.out.println(i);
                    ctadev++;
                }
                count++;
            }
        }

        System.out.println("Total prime " + count);
        System.out.println("Total prime after odd even " + ctadev);
    }

}
