

public class equalsTheArray {

    // Find the equilibrium position from an element

    static void equalsArray(int array[]) {
        
        int i, j, k, left, right;

        int ln=array.length-1;
        for (k = 0; k < ln; k++) {

            left = 0;
            for (i = 0; i < k; i++) {
                left += array[i];
            }

            right = 0;
            for (j = k+1; j < ln; j++) {
                right += array[j];
            }

            if (left == right) {
                
                System.out.println(k);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,5,7,8,9,5,0,3,9 };

        equalsArray(arr);
    }
}
