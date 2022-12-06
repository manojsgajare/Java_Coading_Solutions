package javaStaticKeyword;

// Look at the errors in the below program

// Uncomment the lines

/*
 * When a method declared with the static keyword, it is known as static method.
 * The most common example of the static method is main method.
 */
public class staticMethods {

    static int a = 10;

    int b = 20;

    static void m1() {
        a = 20;
        System.out.println("FROM M1");
        // b = 10;
        // m2();
        // System.out.println(super.a);
    }

    void m2() {
        System.out.println("from m2");
    }

    public static void main(String[] args) {

    }
}
