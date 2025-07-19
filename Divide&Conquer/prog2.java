public class prog2 {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si , int ei){
        if (si >= ei){
             return;
        }
        int pIdx = partition(arr, si , ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si , int ei){
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] arr = {45, 2, 4, 66, 1, 99, 33, 8, 7, 5};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
