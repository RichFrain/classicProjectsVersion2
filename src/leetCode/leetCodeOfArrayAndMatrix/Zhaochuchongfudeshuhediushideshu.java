package leetCode.leetCodeOfArrayAndMatrix;

import java.util.Arrays;

/**
 *  一个数组元素在 [1, n] 之间，其中一个数被替换为另一个数，找出重复的数和丢失的数
 *  Input: nums = [1,2,2,4]
 * Output: [2,3]
 *
 * Input: nums = [1,2,2,4]
 * Output: [2,3]
 */
public class Zhaochuchongfudeshuhediushideshu
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,3,5};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums)
    {
      for (int i = 0;i < nums.length;i++)
      {
          while (nums[i] != i+1 && nums[nums[i] - 1] != nums[i])
          {
              swap(nums,i,nums[i] - 1);
          }
      }

      for (int i= 0;i < nums.length;i++)
      {
          if (nums[i] != i+1)
          {
              return new int[]{nums[i],i+1};
          }
      }
      return null;
    }

    private static void swap(int[] nums,int i,int j)
    {
        int temp = nums[i];
        nums[i]  = nums[j];
        nums[j] = temp;
    }
}
