import java.util.*;
public class InsertionSort {
    public static void InsertionSrt(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]>arr[j-1])
            {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=scn.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        InsertionSrt(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}

