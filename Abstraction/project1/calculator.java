package Abstraction.project1;

public class calculator extends methods {
    
    @Override
    public float div(int a, int b) {
        
        float total = a / b;
        return total;
    }

    @Override
    public int mul(int a, int b) {
        
        int total = a * b;
        return total;
    }

    public static void main(String[] args) {

        calculator cl = new calculator();

        System.out.println("Addition: " + cl.add(10, 20));

        System.out.println("Substraction: "+cl.sub(20, 10));

        System.out.println("Division: "+cl.div(50, 10));

        System.out.println("Multiplication: "+cl.mul(10, 20));
    }

}
