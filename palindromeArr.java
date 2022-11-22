public class palindromeArr {

    static boolean checkArr(int array[]) {

        int i, j;
        int check = 1;

        for (i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            if (array[i] == array[j]) {

            } else {
                check = 0;
            }
        }

        if (check == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 2, 1 };
        System.out.println(checkArr(arr));
    }
}
