import java.util.*;
public class bs1{
    public static void bubbleSort (int arr[])
    {
        for (int turn=0;turn<arr.length-1;turn++)
        {
            for (int j=0;j<arr.length-1-turn;j++)
            {
                if (arr[j]>arr[j+1]) {
                    //swap
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void PrintArr (int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String [] args)
    {
        int arr[] ={2,4,89,76,56,4,21,33,4,0,8};
        bubbleSort(arr);
        PrintArr(arr);

    }
}