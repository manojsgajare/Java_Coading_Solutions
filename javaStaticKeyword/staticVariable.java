package javaStaticKeyword;

public class staticVariable {

    static int a = m1();

    static  {
        System.out.println("Inside static block ");
    }

    static int m1(){
        System.out.println("from m1");
        return 20;
    }

    public static void main(String [] args){

        System.out.println("Value of a: "+ a);
        System.out.println("From main");
    }
    
}

/*
 * from m1
Inside static block
Value of a: 20
From main
 */