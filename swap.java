public class swap {

    public static void main(String[] args) {

        // SWAP BY THIRD VARIABLE
        System.out.println("SWAP BY THIRD VARIABLE");
        int a = 10;
        int b = 20;
        int t;
        System.out.println("  BEFORE-- a- " + a + " b- " + b);
        t = a;
        a = b;
        b = t;
        System.out.println("  AFTER-- a- " + a + " b- " + b);
        System.out.println();

        // SWAP BY ADDITION AND SUBSTRACTION
        System.out.println("SWAP BY ADDITION AND SUBSTRACTION");
        System.out.println("  BEFORE-- a- " + a + " b- " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("  AFTER-- a- " + a + " b- " + b);
        System.out.println();

        // MULTIPLICATION * AND DIV /
        // A and B values should not be zero
        System.out.println("MULTIPLICATION * AND DIV /");
        System.out.println("  BEFORE-- a- " + a + " b- " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("  AFTER-- a- " + a + " b- " + b);
        System.out.println();

        // BITWISE XOR OPERATOR(^)
        System.out.println("BITWISE XOR OPERATOR(^)");
        System.out.println("  BEFORE-- a- " + a + " b- " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("  AFTER-- a- " + a + " b- " + b);
        System.out.println();

    }

}
