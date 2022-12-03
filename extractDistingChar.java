import java.util.ArrayList;

public class extractDistingChar {

    public static void main(String[] args) {
        
        String s1 = "strringg";
        String s2 = "strr";

        String ans ="";

        ArrayList<Character> arr = new ArrayList();

        for (int i=0;i<s2.length();i++){
            if(!arr.contains(s2.charAt(i))){
                arr.add(s2.charAt(i));
            }
        }
        
        for (int i=0;i<s1.length();i++){
            if(!arr.contains(s1.charAt(i))){
                ans += s1.charAt(i);
            }
        }
        System.out.println(ans);
    }

}
