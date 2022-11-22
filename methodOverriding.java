

// Method overriding
/*
 * 

Runtime Polymorphism
Runtime or dynamic Polymorphism is the polymorphism which resolves dynamically at the runtime rather than compile-time is called.
 We can also call it as dynamic binding or Dynamic Method Dispatch. Since the method invocation is during runtime and not during compile-time,
  this type of polymorphism is called Runtime or dynamic polymorphism.

We can achieve dynamic polymorphism in Java with the help of Method Overriding.
 */

class Animal {
    void check() 
    {
        System.out.println("parent class");
    }
}

class Dog extends Animal {
    void check()
    
    {
        System.out.println("child dog class");
    }
}

class Cat extends Animal {
    void check()
    {
        System.out.println("child cat class");
    }
}

public class methodOverriding {

    public static void main(String[] args) {

        Animal an = new Animal();
        an.check();
        Dog dg = new Dog();
        dg.check();
        Cat ct = new Cat();
        ct.check();

    }

}
