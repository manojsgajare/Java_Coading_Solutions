public class findMaxOcuurence {

    static void checkStr(String str){

        int count=0;

        char arr[] = str.toCharArray();

        for(char ch : arr){
            if(ch == 'o'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "aman is good boy";

        checkStr(str);
    }
    
}
