public class removeConsecutive {

    // Find consecutive duplicate
    // "Scalllleeerr  sttttstr"
    static void findConDup(String str){

        char prev=0;
        int count=0;
        char strr[] = str.toCharArray();
        char res[] = new char[strr.length-1];
        for (char c : strr){
            if(prev != c){
                res[count++] = c;
                prev = c;
            }
            
              
            
        }
        System.out.println(res);
        
    }

    public static void main(String[] args) {
        String str = "Scalllleeerr  sttttstr";

        findConDup(str);
    }
    
}
