
// Method Overriding

class first {
    void show() {
        System.out.println("String");
    }
}

class second extends first {
    void show() {
        super.show();
        System.out.println("Array");
    }
}

public class methOverriding {
    public static void main(String[] args) {
        second se = new second();
        se.show();
    }
}
