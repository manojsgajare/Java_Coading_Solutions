public class findMax {

// return the max element index position

static int getMax(int arrr[]){

    int max = arrr[0];
    for (int i=0; i<arrr.length; i++){
        if (arrr[i] > arrr[max]){
            max = i; 
        }
    }

    return max;
}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(getMax(arr));
    }
    
}
