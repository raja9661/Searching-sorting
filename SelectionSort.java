import java.util.*;
public class SelectionSort {
    public static void SelectionSrt(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
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
        SelectionSrt(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
