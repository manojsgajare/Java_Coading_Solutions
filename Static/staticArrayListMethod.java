package Static;

import java.util.ArrayList;

public class staticArrayListMethod {

    public static ArrayList<Integer> myFun(int arr[], int n, int sum) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        return list;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int sum = 15;

        System.out.println(myFun(arr, n, sum));
    }

}
