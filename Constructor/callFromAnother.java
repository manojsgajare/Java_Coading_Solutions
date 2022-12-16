package Constructor;


class callFromAnother{


     int sum;

    // First Constructor
    callFromAnother(){
        this(5 ,2);
    }


    // Second Constructor
    callFromAnother(int arg1, int arg2){
        this.sum = arg1 + arg2;
    }

    // Display Sum
    void display(){
        System.out.println("Sum is : " + sum);
    }


    public static void main(String[] args) {
        
        // Call first class consttructor
        callFromAnother obj = new callFromAnother();


        // Display the method
        obj.display();

    }
}