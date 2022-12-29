package Strings;

public class removeSpaces {

    public static void main(String[] args) {

        String s = "Aman is good boy";

        for (int i = 0; i < s.length(); i++) {

            if (Character.isLetter(s.charAt(i))) {

                System.out.print(s.charAt(i));
            }
        }
    }
}
