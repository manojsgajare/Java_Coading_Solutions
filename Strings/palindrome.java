package Strings;

public class palindrome {

    public static boolean checkPalindrome(char[] ch) {
        int flag = 1;
        if (ch.length < 2) {
            return false;
        }
        for (int i = 0, j = ch.length - 1; i < ch.length / 2; i++, j--) {
            if (ch[i] == ch[j]) {
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "abcba";
        s.toLowerCase();
        char[] ch = s.toCharArray();
        System.out.println(checkPalindrome(ch));
    }

}
