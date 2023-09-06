import java.util.*;
class BubbleSort
{
    public static void BubbleSrt(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(swap==false)
            {
                break;
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
        BubbleSrt(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}