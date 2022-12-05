import java.util.Arrays;

public class arrDup {

    public static void main(String[] args) {
        
        int arr[] = {1,3,5,7,9,9,9,2,0};

        Arrays.sort(arr);
        int result[] = new int[arr.length-1];

        for (int i=0;i<arr.length-1;i++){
            result[i] = arr[i];
            if(arr[i+1] == result[i]) {
                arr[i] = result[i];
            }
            System.out.println(arr[i]);
        }

    }
    
}
