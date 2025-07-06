// First Occurence of a Number

public class prog7 {
    public static int firstOccurence (int arr[] , int key , int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main (String [] args){
        int arr[] = {3,0,2,5,5,4,6,6,42,6,9,0,1,2,4};
       System.out.println(firstOccurence(arr, 0, 0));
    }
}
