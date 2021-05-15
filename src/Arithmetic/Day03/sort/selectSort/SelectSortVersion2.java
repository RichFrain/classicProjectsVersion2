package Arithmetic.Day03.sort.selectSort;

import java.util.Arrays;

public class SelectSortVersion2
{
    public static void main(String[] args)
    {
        int arr[] = {101, 34, 119, 1};

        for (int i = 0; i < arr.length -1; i++)
        {

            int minIndex = i;
            int min = arr[i];//假定arr[0] 为最小值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    minIndex = j;
                    min = arr[j];
                }
            }
            if (minIndex != 0) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
            System.out.print("第"+i+"次排序:");
            System.out.println(Arrays.toString(arr));
        }
    }

}
