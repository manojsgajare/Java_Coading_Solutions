public class balanceTheArray {

    public static void main(String[] args) {

        int arr[] = { 8, 4, 2, 6 };

        int length = arr.length;
        int i = 0;
        int j = length - 1;
        int leftSum = arr[i++];
        int rightSum = arr[j--];

        int ans = 0;
        while (i <= j) {
            if (leftSum == rightSum) {
                ans = leftSum;
                i++;
                j--;
            } else if (leftSum < rightSum) {
                leftSum += arr[i++];
            } else {
                rightSum += arr[j--];
            }

        }
        System.out.println(ans);
    }
}
