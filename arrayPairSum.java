public class arrayPairSum {

    public static void main(String[] args) {
        
        int arr[]= {2,1,3,4,6,5,8,7,9};
        int sum =10;

        for (int i=0;i<arr.length-1;i++){
            if(arr[i] + arr[i+1] == sum){
                System.out.println( arr[i] +" + " + arr[i+1] + " = " + sum );
            }
        }
    }
    
}
