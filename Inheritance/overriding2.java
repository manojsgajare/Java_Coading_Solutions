
// Inheritance

public class overriding2 {

    static int a;
    static int b;

}

class child extends overriding2 {

    void print(int a, int b) {
        System.out.println(a - b);
    }

}

class child2 extends child {

    void print(int a, int b) {

        System.out.println(a + b);
    }
}

class child3 extends child2 {
    public static void main(String[] args) {

        child3 c3 = new child3();
        c3.print(3, 4);
        c3.print(3, 4);
    }
}