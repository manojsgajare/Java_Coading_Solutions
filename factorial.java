public class factorial {

    public static int fact(int number){
    int result=1;
    
    while(number !=0){
        result *= number;
        number--;
    }

        return result;
    }
    
    public static void main(String[] args){
        int num = 5;
        System.out.println(fact(num));
    }
}
