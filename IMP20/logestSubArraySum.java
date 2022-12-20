package IMP20;

import java.util.ArrayList;

public class logestSubArraySum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int start = 0;

        int end = 0;

        int currSum = 0;

        ArrayList<Integer> newList = new ArrayList<Integer>();

        if (s == 0) {

            newList.add(-1);

            return newList;

        }

        while (end < n) { // run till end <n

            currSum += arr[end];

            while (currSum > s) {

                currSum -= arr[start];

                start++;

            }

            if (currSum == s) {

                newList.add(start + 1);

                newList.add(end + 1);

                return newList;

            }

            end++;

        }

        newList.add(-1);

        return newList;

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int sum = 15;

        System.out.println(subarraySum(arr, n, sum));

    }

}
