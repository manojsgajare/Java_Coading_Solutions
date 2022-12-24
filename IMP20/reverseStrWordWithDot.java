package IMP20;

public class reverseStrWordWithDot {

    public static void main(String[] args) {

        String str = "I am rich";

        String[] arr = str.split(" ");

        String temp = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            temp = temp + arr[i];

            if (i != 0) {
                temp += ".";
            }
        }

        System.out.println(temp);

    }

}
