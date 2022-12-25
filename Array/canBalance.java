package Array;

public class canBalance {


    // balance the array
    public static boolean canbalance(int[] array) {

            // left>>     0   1   2   3   4     <<right
        // int arr[] = { 10, 0, 1, -1, 10 };

        int leftSum = array[0]; // left sum start from 0 pos
        int rightSum = array[array.length - 1]; // right sum start from last position: 4
        int i = 1; // start i from 1 beccause 0 occupied by leftsum
        int j = array.length - 2;   // start j from length:4 minus 2 beccause last pos. occupied by right sum

        if (array.length == 1) {    // we need atleast 2 element 
            return false;
        }

        while (i <= j) {    // base condition : sould be i less than or equalTo 

            if (leftSum > rightSum) {  // condition 1: leftsum greater than rightsum 
                rightSum += array[j];   // j pos array element add to rightsum 
                j--;    // j: arraylenght therefore reduce the number j--

            } else if (leftSum < rightSum) {   // condition 2: leftsum less than rightsum
                leftSum += array[i];    // means we need to add next elem to rightsum
                i++;    // increse the i by 1

            } else {  // if both condition not executed then execute else part

                leftSum += array[i];
                i++;

                rightSum += array[j];
                j--;
            }
        }

        if (leftSum == rightSum) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        int arr[] = { 10, 0, 1, -1, 10 };
        System.out.println(canbalance(arr));
    }

}
