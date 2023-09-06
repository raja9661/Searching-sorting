class MergeSort
{
    public static void merge(int arr[],int s,int mid,int e)
    {
        int temp[]=new int[6];
        int left=s;
        int right=mid+1;
        //{5,8,1,7,3,2,6};
        int i=0;
        while(left<=mid && right<=e )
        {
            if(arr[left]<=arr[right])
            {
                temp[i]=arr[left];
                i++;
                left++;
            }
            else
            {
                temp[i]=arr[right];
                i++;
                right++;
            }
        }
        while(left<=mid)
        {
            temp[i]=arr[left];
            i++;
            left++;
        }
        while(right<=e)
        {
            temp[i]=arr[right];
            i++;
            right++;
        }
        for(int j=s;j<=e;j++)
        {
            arr[j]=temp[j];
        }
        for(int j=s;j<=e;j++)
        {
            System.out.print(arr[j]+" ");
        }
        
    }
    public static void Mergesort(int arr[],int s,int e)
    {
        int mid;
        if(s>=e)
        {
            return;
        }
        mid=s+(e-s)/2;
        System.out.print(mid+" ");
        Mergesort(arr, s, mid);
        Mergesort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }
    public static void main(String args[])
    {
        int arr[]={5,8,1,7,3,2,6};
        int s=0;
        int e=arr.length-1;
        Mergesort(arr, s, e);
    }
}