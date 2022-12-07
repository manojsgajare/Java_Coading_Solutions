public class overloading2 {

    public void bark() {
        System.out.println("First method");
    }

    // overloading method
    public void bark (int num){
        for (int i=0;i<num;i++){
            System.out.println("second method overloaded");
        }
    }


    public static void main(String [] args){

        int n = 2;
        overloading2 over = new overloading2();
        over.bark();
        over.bark(n);
    }
    
}
