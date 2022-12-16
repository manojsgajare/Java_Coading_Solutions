package IMP20;

// 0 1 1 2 3 5 8 13 21 34
//  Fibonacci series in Java
// In fibonacci series, next number is the sum of previous two numbers 
// for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
//  The first two numbers of fibonacci series are 0 and 1.


import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        
        int n1 = 0, n2=1, n3, i;
       
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(n1 + "\n " + n2);

        for ( i=2; i < num; i++){

            n3 = n1 + n2;

            System.out.println( n3);
            n1 = n2;
            n2 = n3;
        }
    }
    
}
