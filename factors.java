import java.util.Scanner;

class factors{

    static void checkFactor (int n){

    
        for (int i=1;i<n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer");
        int n = sc.nextInt();

        checkFactor(n);

    }
}