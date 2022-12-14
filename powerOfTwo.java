public class powerOfTwo {

    public static void main(String[] args) {
        
        boolean b = true;

        int num = 22;

        while(num!=1){
            if(num%2==0){
                b = false;
                System.out.println(b);
                System.exit(0);
            }
            num = num / 2;
        }
        System.out.println(b);
    }
    
}
