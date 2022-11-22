import java.util.ArrayList;
// code
// Find digit from the given string
// Given string is separated into two character lists 
public class findDigitStr {

    static void checkDigit(String str){

        ArrayList <Character> al = new ArrayList<>();
        ArrayList <Character> ch = new ArrayList<>();

        
        for (int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                al.add(str.charAt(i));
            }else{
               ch.add(str.charAt(i));
            }
        }

        System.out.println(al);
        System.out.println();
        System.out.println(ch);
       
    }
    public static void main(String[] args) {
        String str = "nmbds23j35b";

        checkDigit(str);
    }
}
