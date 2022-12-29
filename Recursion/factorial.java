package Recursion;

public class factorial {
    static int factor(int number) {

        if (number == 0) {
            return 1;
        }
        return number * factor(number - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(factor(n));
    }
}
