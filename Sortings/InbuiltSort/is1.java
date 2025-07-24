import java.util.*;
public class is1 {
    public static void InsertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }
    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 89, 76, 56, 4, 21, 33, 4, 0, 8};
        //InsertionSort(arr);
        Arrays.sort(arr,Collections.reverseOrder());

        PrintArr(arr);
    }
}
