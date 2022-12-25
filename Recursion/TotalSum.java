package Recursion;

public class TotalSum {

    static int solve(int number) {

        if (number == 0) {
            return 1;
        }

        return number + solve(number - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(solve(n));
    }

}
