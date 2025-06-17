import java.util.*;
public class ss1{
    public static void SelectionSort (int arr[])
    {
       for (int i=0; i<arr.length;i++)
       {
        int minPos=i;
            for(int j=i+1;j<arr.length;j++)
            {
                 if (arr[minPos]>arr[j])
                 {
                        minPos=j;
                }
            }
            //swap
            int temp =arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
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
        SelectionSort(arr);
        PrintArr(arr);

    }
}