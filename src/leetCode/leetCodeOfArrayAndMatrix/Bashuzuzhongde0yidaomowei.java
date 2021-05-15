package leetCode.leetCodeOfArrayAndMatrix;

import java.util.Arrays;

/**
 * 把数组中的0移到末尾
 * given nums = [0, 1, 0, 3, 12],
 * after calling your function, nums should be [1, 3, 12, 0, 0].
 */
public class Bashuzuzhongde0yidaomowei
{
    public static void main(String[] args)
    {
        int[] arr = {0,2,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));


    }
    public static void moveZeroes(int[] nums)
    {
        int idx = 0;
        for (int i = 0;i < nums.length;i++)
        {
            if (nums[i] != 0)
            {
                nums[idx] = nums[i];
                idx++;
            }
        }
        while (idx < nums.length)
        {
            nums[idx] = 0;
            idx++;
        }
    }
}
