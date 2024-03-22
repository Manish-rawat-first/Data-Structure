public class Algo {
    
    static int findPivot(int arr[],int start,int end){
      int pivot = arr[end];
      int low = start-1;

      for(int st = start;st<end;st++){
        if(arr[st]<pivot){
            low++;
            int temp = arr[low];
            arr[low] = arr[st];
            arr[st] = temp;
        }
      }
      low++;
      int temp = arr[low];
      arr[low] = arr[end];
      arr[end] = temp;
      return low;

        
    }

    // partition Array
    static void partition(int arr[],int start,int end) {
       if(start<end){
        int pivot = findPivot(arr,start,end);
        partition(arr, start, pivot-1);
        partition(arr, pivot+1, end);
       }
    }
    public static void merge(int arr[]){
        partition(arr,0,arr.length-1);
    }
    // Print Array
    static void printArra(int... arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,-1,1,9,2,1,7,5};
        if (arr != null) {
            merge(arr);
            printArra(arr);
        }
    }

}
