// Check if Array is Sorted or not 

public class prog6 {
    public static boolean isSorted (int arr[], int i){
        if (i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,3,5,2,};
        System.out.print((isSorted(arr, 0)));
    }
}
