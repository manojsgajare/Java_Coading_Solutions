public class swapPrimeNumberPair {


    public static boolean checkPrime(int sum){

        for (int i=2;i<sum/2;i++){
            if (i%2==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        
        int arr[] = {5,8,9,0,4,2,34,5,7,8,2,4,5,6,78,9,0,7,5,4,3,6,7,8,9};

        int n = arr.length-1;

        for (int i=0; i<n; i=i+2){
            if(checkPrime(arr[i] + arr[i+1])){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
