class numberPalindrome {

    public static void main(String[] args) {
        
        int n = 454;
        int sum=0;
        int temp=n;
        int result;


        while (n>0){
            result = n%10;
            sum = (sum*10) + result;
            n= n/10;
   
        }

        if (temp == sum){
            System.out.println("palindrome number");
        } else{
            System.out.println("not palindrome");
        }
    }
    
}
