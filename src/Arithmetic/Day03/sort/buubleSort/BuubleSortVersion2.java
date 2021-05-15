package Arithmetic.Day03.sort.buubleSort;

import java.util.Arrays;

public class BuubleSortVersion2
{
    public static void main(String[] args)
    {
        int arr[] = {1, 20, 19, 18, -1};
        System.out.print("排序前:");
        System.out.println(Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length -1 -i;j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.print("第"+i+"趟排序:");
            System.out.println(Arrays.toString(arr));
        }

    }
}
