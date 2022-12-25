package Recursion;

public class arraySum {

    static int solve(int[] array) {

        int sum = 0;
        int i = array.length - 1;
        while (i >= 0) {
            sum = sum + array[i];
            i--;
        }

        return sum;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4 };

        System.out.println(solve(arr));
    }

}
