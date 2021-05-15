package Arithmetic.Day04.search;

import java.util.ArrayList;
import java.util.List;

/**
 *  当一个数组里多个相同的数，如何将所有的数都查找到
 */
public class BinarySearchVersion2
{
    public static void main(String[] args)
    {
        int[] arr = {1,8,10,99,1000,1000,1000,1234567};
        System.out.println(binarySearch(arr,0,arr.length - 1,1000));

    }

    public static List<Integer> binarySearch(int[] arr,int left,int right,int findVal)
    {
        while (left < right)
        {
            int mid = (left + right)/2;
            int midVal = arr[mid];
            if (midVal > findVal)
            {
                return binarySearch(arr,left,mid - 1,midVal);
            }
            else if (midVal < findVal)
            {
                return binarySearch(arr,mid + 1,right,findVal);
            }
            else
            {
                /*
                   1. 找到mid索引值，不要马上返回
                   2. 向mid 索引值的左边扫描，将所有满足 findVal 元素的下标，加入到集合ArrayList
                   3. 向mid 索引值的右边扫描，将所有满足 findVal 元素的下标，加入到集合ArrayList
                 */
                List<Integer> resIndexList = new ArrayList<Integer>();
                int temp = mid -1;
                while (true)
                {
                    if (temp < 0|| arr[temp] !=findVal)
                    {
                        break;
                    }
                    resIndexList.add(temp);
                    temp --;
                }
                resIndexList.add(mid);
                temp = mid + 1;
                while (true)
                {
                    if (temp > arr.length - 1 || arr[temp] != findVal)
                    {
                        break;
                    }
                    resIndexList.add(temp);
                    temp ++;
                }
                return resIndexList;
            }
        }
        return new ArrayList<Integer>();
    }
}
