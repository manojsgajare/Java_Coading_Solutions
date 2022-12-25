package IMP20;

public class factorialRecursion {

    static int factorial(int number) {

        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1); // function calling itself
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("factorial " + factorial(n));
    }

}
