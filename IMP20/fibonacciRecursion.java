package IMP20;

import java.util.Scanner;
// print fibbonacci series using recursion

// 0 1 1 2 3 5 8 13 21 34 55 89
public class fibonacciRecursion {

    static int n1 = 0, n2 = 1, n3;

    static void printFibonacci(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);

            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.print(n1 + " " + n2);
        printFibonacci(num);

    }

}
