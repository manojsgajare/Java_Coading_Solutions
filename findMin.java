public class findMin {

// Return the min element index

    static int getMin(int arr[]){
        int min = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i] < arr[min]){
                min=i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {1,23,4,56,7};

        System.out.println(getMin(arr));
    }
    
}
