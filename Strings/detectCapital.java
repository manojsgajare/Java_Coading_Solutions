package Strings;

// leetcode: 520. Detect Capital

class detectCapital{

    public boolean detectCapitalUse(String word) 
    {
         word = word.trim();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                if(i > 0 && (word.charAt(i-1) < 'A' || word.charAt(i-1) > 'Z')) {
                    return false;
                }
            } else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                if(i > 1 && (word.charAt(i-1) < 'a' || word.charAt(i-1) > 'z')) {
                    return false;
                }
            } 
        }
        return true;
    }
    public static void main(String[] args) {
        
        String word = "ABC";

        detectCapital dct = new detectCapital();
        System.out.println(dct.detectCapitalUse(word));
    }
}