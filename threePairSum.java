public class threePairSum {

    static void checkSum(int arr[], int n){
        for (int i=0; i<arr.length;i++){
            for (int j=i+1; j<arr.length; j++){
                for (int k=j+1; k<arr.length; k++){
                    if (arr[i] + arr[j] + arr[k] == n){
                        System.out.println(arr[i] + " "+ arr[j] + " "+ arr[k]);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = 8;
        checkSum(arr, n);
    }
}
