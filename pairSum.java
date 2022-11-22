public class pairSum {

    static void findSum(int arr[], int sum){
        for (int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + "--" + arr[j]);
                }
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,8,2};
        int sum = 10;

        findSum(arr, sum);
    }
    
}
