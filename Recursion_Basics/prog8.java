// Last Occurence of a Number

public class prog8 {
    public static int lastOccurence (int arr[] , int key , int i){
        if (i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main (String [] args){
        int arr[] = {3,0,2,5,5,4,6,6,42,6,9,0,1,2,4};
       System.out.println(lastOccurence(arr, 0, 0));
    }
}