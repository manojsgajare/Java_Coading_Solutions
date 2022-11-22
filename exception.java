

import java.util.*;

public class exception {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        int y;

        
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x / y);
            sc.close();
        } catch (ArithmeticException | InputMismatchException e) {

            if (e instanceof ArithmeticException) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if (e instanceof InputMismatchException) {
                System.out.println("java.util.InputMismatchException");
            }
        }

    }
}
