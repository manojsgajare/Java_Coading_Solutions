
class twoPointer2 {

    // FIND THE SUM ARRAYS SUBARRAY

    static void subArr(int arr[], int target) {
        int p1 = 0;
        int p2 = 0;
        int currentSum = 0;

        while (p1 != arr.length) {
            while (p2 != arr.length) {
                if (currentSum + arr[p2] == target){
                    System.out.println(p1 + " "+p2);
                    return;
                } else if(currentSum + arr[p2] < target){
                    currentSum += arr[p2];
                    p2++;
                }else{
                    break;
                }
            }
            currentSum -= arr[p1];
            p1++;
        }
       System.out.println("No subarray with targeted sum found");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 40;

        subArr(arr, target);

    }
}