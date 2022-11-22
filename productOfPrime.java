import java.util.Scanner;

public class productOfPrime {

    public static void findProduct(int n) {

        // Check number is prime
        long product = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Value of i " + i);
                    product *= i;
                }
            }
        }
        System.out.println("Final product " + product);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        findProduct(num);
    }

}
