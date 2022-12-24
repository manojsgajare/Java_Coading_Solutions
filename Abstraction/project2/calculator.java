package Abstraction.project2;

public class calculator extends divMulAbsClass 
{
    @Override
    public void sum(int a, int b) {
        System.out.println(a+b);
        
    }

    @Override
    public void sub(int a, int b) {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        
        calculator cl = new calculator();

        cl.div(5, 10);
        cl.mul(4, 5);
        cl.sub(20, 10);
        cl.sum(20, 20);
        

    }

    
}

//System.out.println("sum: " + a + b);
