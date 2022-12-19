public class twosum1 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int t = 7;
        solve(arr, t);
    }

    // static void solve(int arr[], int target) {
    // int i;
    // for (i = 0; i < arr.length - 1; i++) {
    // if (arr[i] + arr[i + 1] == target) {
    // System.out.println(arr[i] + " + " + arr[i + 1] + " = " + target);
    // }
    // }
    // }

    static void solve(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }
}
