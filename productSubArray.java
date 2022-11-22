public class productSubArray {
    public static void main(String[] args) {
        int arrr[] = {1,2,3,4};
        // subArr[] = {24, 12, 8, 6}; Create this array

        // while(arr[i]){

        // }
        int count[]=new int[arrr.length];
        for (int i=0; i<arrr.length;i++){
            for (int j=1; j<arrr.length;j++){
                count[i] =  arrr[i+1] * arrr[j];
            }
           System.out.println(count[i]);
        }
    }
}
