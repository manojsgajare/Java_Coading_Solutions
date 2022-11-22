import java.util.Arrays;

public class anagramStr {

    static boolean isStrAnagram(String str1, String str2) {

        if (str1.length() != str2.length()){
        return false;
        }

        String thisStr1 = str1.toLowerCase();
        String thisStr2 = str2.toLowerCase();

        char arr1[] = new char[thisStr1.length()];
        for (int i = 0; i < thisStr1.length(); i++) {
            arr1[i] = thisStr1.charAt(i);
        }
        Arrays.sort(arr1);
        System.out.println(arr1);

        char arr2[] = new char[thisStr2.length()];
        for (int i = 0; i < thisStr2.length(); i++) {
            arr2[i] = thisStr2.charAt(i);
        }
        Arrays.sort(arr2);
        System.out.println(arr2);

        if (Arrays.equals(arr1, arr2)){
           return true;
        }else{
            return false;
        }        
    }

    public static void main(String[] args) {

        String str1 = "Manoj Gajare";
        String str2 = " GajareManoj";
        System.out.println(isStrAnagram(str1, str2));
    }
}
