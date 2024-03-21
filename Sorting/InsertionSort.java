import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12,34,56,3,2};
        for(int i = 1;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];

            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.print(Arrays.toString(arr));
    }
    
}
