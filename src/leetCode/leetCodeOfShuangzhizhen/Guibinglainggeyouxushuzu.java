package leetCode.leetCodeOfShuangzhizhen;

import java.util.Arrays;

/**
 * 归并两个有序数组
 *Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * Output: [1,2,2,3,5,6]
 * 把归并结果存到第一个数组上
 */
public class Guibinglainggeyouxushuzu
{
    public static void main(String[] args)
    {
        int[] temp1 = {1,2,3,0,0,0};
        int[] temp2 = {2,5,6};
        merge(temp1,6,temp2,3);
        System.out.println(Arrays.toString(temp1));

    }
    /*
    需要从尾开始遍历，否则在 temp1 上归并得到的值会覆盖还未进行归并比较的值。
     */
    public static void merge(int[] temp1,int m,int[] temp2,int n)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;
        while (i >= 0 && j >= 0)
        {
            if (temp1[i] > temp2[j])
            {
                temp1[k--] = temp1[i--];
            }
            else
            {
                temp1[k--] = temp2[j--];
            }
        }
        while ( i >= 0)
        {
            temp1[k--] = temp1[i--];
        }
        while (j >= 0)
        {
            temp1[k--] = temp2[j--];
        }

    }
}
