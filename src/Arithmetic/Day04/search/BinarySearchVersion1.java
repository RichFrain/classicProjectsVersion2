package Arithmetic.Day04.search;

public class BinarySearchVersion1
{
    public static void main(String[] args)
    {
        int[] arr = {1,8,10,99,1000,1234567};
        System.out.println(binarySerach(arr,0,arr.length - 1,1));

    }

    public static int binarySerach(int[] arr, int left,int right,int findVal)
    {
        int mid = (left+right)/2;
        int midVal = arr[mid];
        while (left < right)
        {
        if (findVal == midVal)
        {
            return mid;
        }
        else if ( findVal > midVal)
        {
           return binarySerach(arr,mid + 1,right,findVal);
        }
        else
        {
            return binarySerach(arr,left,mid - 1,findVal);
        }
        }
        return -1;
    }
}
