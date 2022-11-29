import java.util.HashMap;
import java.util.List;

class compareStrings{
    public static void main(String []args){

        String str1 = "manoj";
        String str2 = "monoj";

        if (str1.length() != str2.length()){
            return;
        }

        int count=0;
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> xy = new HashMap<>();

        for (int i=0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
               if( str1.charAt(i) == str2.charAt(j) )
               {
                    if (hm.containsKey(str1.charAt(i))){
                        hm.put(str1.charAt(i), count +1);
                    }else{
                        hm.put(str1.charAt(i),  1);
                    }

                    if (xy.containsKey(str2.charAt(j))){
                        xy.put(str2.charAt(j), count +1);
                    }else{
                        xy.put(str2.charAt(j),  1);
                    }
                }
            }
        }

        System.out.println(hm);
        System.out.println(xy);
    }
}