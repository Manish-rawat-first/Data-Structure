public class MergeSort {

    // Merge Array
    public static void conquer(int start,int mid,int end,int arr[]){
        int merge[] = new int[end-start+1];
        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid && idx2<=end){
            merge[x++] = ((arr[idx1]<arr[idx2])?arr[idx1++]:arr[idx2++]);
        }

        while(idx1<=mid){
            merge[x++] = arr[idx1++];
        }

        while(idx2<=end){
            merge[x++] = arr[idx2++];
        }

        for(int i = 0;i<merge.length;i++){
            arr[i+start] = merge[i];
        }
     }

    // Print Array
    public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

   // Divide
    public static void divide(int start,int end,int arr[]){
        if(arr.length == 0 || arr == null || start>=end){
            return;
        }
        int mid = (start+end)/2;
        divide(start, mid, arr);
        divide(mid+1, end, arr);
        conquer(start, mid,end, arr);

    }
       
    public static void main(String[] args) {
        int arr[] = {12,2,1,3,44,0,-1};
        divide(0,arr.length-1,arr);
        printArray(arr);

        
    }
    
}
