public class countWord {

    // TargetWord Aman

    static void findThis(String str){
        int count =0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'A' && str.charAt(i+1) == 'm' && str.charAt(i+2) == 'a' && str.charAt(i+3) == 'n'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str = "AmanAmanmanAAman";
        findThis(str);
    }
    
}
