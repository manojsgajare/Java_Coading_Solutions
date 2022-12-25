
class twoPointer2 {

    // FIND THE target SUM from ARRAYS SUBARRAY

    static void subArr(int arr[], int target) {
        int p1 = 0;
        int p2 = 0;
        int currentSum = 0;

        // here we need subarray

        while (p1 != arr.length) { // p1 start from 0, not equal to array length
            while (p2 != arr.length) { // p2 start from 0, not equal to array length
                if (currentSum + arr[p2] == target) { // 0 + array[0]: 1 == target: 40 >>> return; end operation
                    System.out.println(p1 + " " + p2);
                    return;
                } else if (currentSum + arr[p2] < target) { // 0 + array[0]:1 is less than target:40 then add both
                                                            // and increase the p2 by 1: 1
                    currentSum += arr[p2];
                    p2++;
                } else { // else break the opeartion
                    break;
                }
            } // inner while loop end
            currentSum -= arr[p1]; // first while loop >> remove the last added element from sum i.e. array[p1]
            p1++; // increse the p1
        }
        System.out.println("No subarray with targeted sum found"); // if not any condition become true
        // print this
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };  // array declared
        int target = 40;    // target sum

        subArr(arr, target); // pass by reference

    }
}