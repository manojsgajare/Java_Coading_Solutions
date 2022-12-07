
/*
 * Compile-time Polymorphism
 * Also known as Static polymorphism, is the type of polymorphism that is
 * resolved at the time of compilation. It can be achieved by either method
 * overloading or operator overloading.
 */

class compileTimePolymorphism {
    void opearator(String str1, String str2) {
        String s = str1 + str2;
        System.out.println("Conacatenated String = " + s);
    }

    void opearator(int a, int b) {
        int c = a + b;
        System.out.println("Sum = " + c);
    }
}

public class methodOverloading {
    public static void main(String[] args) {
        compileTimePolymorphism cmp = new compileTimePolymorphism();
        cmp.opearator("hey", " buddy");
        cmp.opearator(10, 20);
    }
}
