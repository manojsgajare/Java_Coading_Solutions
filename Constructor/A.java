package Constructor;

class A {

    A(int i) {
        System.out.println(i);
    }

    A() {   // Default constructor call

    }

    class B extends A {

    }

    public static void main(String[] args) {

        A a = new A(5);

    }
}