import java.util.*;


class arrayTempearature {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        in.close();
        int arr[] = { -1, 8, 4, 8, 2, -5};

        if (arr.length == 0) {
            System.out.println("0");
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == 0) {
                System.out.println(arr[i+1]);
            }else if(arr[i] < 0 && arr[i] < 0 ){
                System.out.println(arr[i-1]);
            }
        }
    }
}