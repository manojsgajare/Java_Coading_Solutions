package Super;
// Java code to show use of 

// Super keyword with constructor

public class super1 {

    super1() {
        System.out.println("super1 class constructor");
    }

}

// Subclass Student extends super1
class super2 extends super1 {

    super2() {
        // invoke or call parent class constructor
        super();

        System.out.println("super2 class Constructor");
    }
}

// Driver program
class test {
    public static void main(String[] args) {
        super2 st = new super2();
    }
}

/*
 * Output
 * super1 class constructor
 * super2 class Constructor
 */