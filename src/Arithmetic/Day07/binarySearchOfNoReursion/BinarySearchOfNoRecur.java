package Arithmetic.Day07.binarySearchOfNoReursion;

public class BinarySearchOfNoRecur
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,5,9,100};
        System.out.println(binarySearch(arr,100));

    }

    public static int binarySearch(int[] arr,int target)
    {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right)
        {
            int mid = (left + right )/2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
      return -1;
    }
}
