import java.util.Arrays;

public class SelectionSort{
    public static void selectionSort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {23,34,1,2,67,54};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}