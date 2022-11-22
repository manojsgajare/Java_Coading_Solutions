public class toUpperCase {
    public static void main(String[] args) {

        String str = "hello";
        String str1 = "java";

        String thisStr = str + " " + str1;
        boolean foundSpace = true;
        char arr[] = thisStr.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (Character.isLetter(arr[i])) {

                if (foundSpace) {
                    arr[i] = Character.toUpperCase(arr[i]);
                    foundSpace = false;
                }

            } else {
                foundSpace = true;
            }
        }
        thisStr = String.valueOf(arr);
        System.out.println(thisStr);
    }
}