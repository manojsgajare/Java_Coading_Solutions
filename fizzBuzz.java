public class fizzBuzz{

    public static void main(String[] args) {
        
        int n = 100;

        printfFizzBuzz(n);
    }

    static void printfFizzBuzz(int n){
        
        for (int i=0; i<n; i++){
            if (i%3==0 && i%5==0){
                System.out.println("FIZZBUZZ");
            } else if (i%3 ==0) {
                System.out.println("FIZZ");
            } else if (i%5 ==0){
                System.out.println("BUZZ");
            } else{
                System.out.println("Invalid");
            }
        }
    }
}