public class prog3 {
    public int Search(int arr[], int target, int si, int ei) {
        if (si > ei) return -1;

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) { // left half is sorted
            if (arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid - 1);
            } else {
                return Search(arr, target, mid + 1, ei);
            }
        } else { // right half is sorted
            if (arr[mid] <= target && target <= arr[ei]) {
                return Search(arr, target, mid + 1, ei);
            } else {
                return Search(arr, target, si, mid - 1);
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        prog3 obj = new prog3(); // create an object
        System.out.println(obj.Search(arr, target, 0, arr.length - 1));
    }
}
