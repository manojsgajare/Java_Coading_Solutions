

public class palindrome {

    public static boolean isPalindrome(String thisString){

        
        int i,j;
        int check = 1;
        for (i=0, j=thisString.length()-1; i<thisString.length(); i++, j--){
            if (thisString.charAt(i) == thisString.charAt(j)){
                
            } else{
                check = 0;
            }
        }

        if (check == 1){
            return true;
        }else{
            return false;
        }

       
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String str = "a";
        System.out.println(isPalindrome(str));   
    }
}
