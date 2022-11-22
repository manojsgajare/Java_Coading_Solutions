public class removeAdjtDup {

    // Program to remove adjacent duplicate

   public static String thisString(String str){
    char prev = 0;
    int count = 0;

        if (str == null){
            return null;
        }
        char[] ch = str.toCharArray();

        for (char c : ch){
            if (prev != c){
                ch[count++] = c;
                prev = c;
            }
        }
        return new String(ch).substring(0, count);
    }

    public static void main(String[] args) {
    String s = "AAABBBCCCDDD";

    System.out.println(thisString(s));
}
    
}
