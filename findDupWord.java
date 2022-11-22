import java.util.*;

public class findDupWord {

    static void checkThisStr(String str) {
        HashMap<String, Integer> hm = new HashMap<>();
        String string [] = str.split(" ");
       
        for (int i=0; i<string.length; i++){

            if (hm.containsKey(string[i])){
                int count =hm.get(string[i]);
                hm.put(string[i], count+1);
            }
            else{
                hm.put(string[i], 1);
            }
        }
        System.out.println(hm);
    }

    public static void main(String[] args) {
        String str = "I am am learning java java";
        checkThisStr(str);
    }

}
