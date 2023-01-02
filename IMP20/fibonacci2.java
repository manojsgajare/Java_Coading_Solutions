package IMP20;

public class fibonacci2 {

    public static void main(String[] args) {

        long num = 50;
        long n1 = 0, n2 = 1, n3;

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i <= num; i++) {

            n3 = n1 + n2;

            System.out.print(n3 + " ");

            n1 = n2;
            n2 = n3;
        }

    }

}
