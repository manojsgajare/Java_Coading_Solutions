import java.util.ArrayList;
// Leaders In An Array
public class leaderArr {
    public static void main(String[] args) {
        int arr[] = {16,17,4,3,5,2};
        int max = arr[arr.length-1];
        ArrayList<Integer> leader = new ArrayList<>();
        leader.add(max);
        for (int i=arr.length-2; i>=0; i--){
            if (arr[i] > max){
                leader.add(arr[i]);
                max= arr[i];
            }
        }
        System.out.println(leader);
    }
    
}
