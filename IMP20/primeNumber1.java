package IMP20;

public class primeNumber1 {

    static boolean checkPrime(int n) {

        for (int i = 2; i < n / 2; i++) {

            if (n % i == 0) {

                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {

        int n = 100;
        int count = 1;
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {

                System.out.println("primae Number " + count + " : " + i);
                count++;
            }
        }

    }

}
