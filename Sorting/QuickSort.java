public class QuickSort {
    public static void printArray(int... arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int findPivot(int arr[], int start, int end) {
        int pivot = arr[end];
        int idx = start-1;
        for(int st = start;st<end;st++){
            if (arr[st] < pivot) {
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[st];
                arr[st] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = pivot;
        arr[end] = temp;
        return idx;

    }

    public static void divide(int start, int end, int arr[]) {
        if (arr == null || arr.length == 0 || start >= end) {
            return;
        }
        int pivot = findPivot(arr, start, end);
        divide(start, pivot - 1, arr);
        divide(pivot + 1, end, arr);
    }


    public static void main(String[] args) {
        int arr[] = { -1, 2, 4, 3, 1, 2, 1, 6, 4, 8, 90, -40 };
        divide(0, arr.length - 1, arr);
        printArray(arr);
    }

}
