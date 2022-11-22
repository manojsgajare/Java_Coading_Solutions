import java.util.Scanner;

public class primeFactor {

    public static void checkPrimeFactor(int number) {

        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println("This is i " + i);
                number /= i;
            }
        }
        if (number > 2) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        checkPrimeFactor(n);
    }

}
