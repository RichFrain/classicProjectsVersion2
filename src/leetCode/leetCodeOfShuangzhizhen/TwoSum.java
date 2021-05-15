package leetCode.leetCodeOfShuangzhizhen;

import java.util.Arrays;

/**
 * 有序数组的Two Sum
 * 题目描述 ： 在有序数组中找出两个数，使它们的和为target
 *Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSum
{
    public static void main(String[] args)
    {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));

    }

    /*
          使用双指针，一个指针指向值较小的元素，一个指针指向值较大的元素。
          指向较小元素的指针从头向尾遍历，指向较大元素的指针从尾向头遍历。
          如果两个指针指向的元素和 sum == target,那么得到要求
           sum > target,移动较大的指针，使sum变小一些
           sum < target，移动较小的指针，使sum变大一些
        */
    public static int[] twoSum(int[] numbers,int target)
    {
        int front = 0;
        int last = numbers.length - 1;

        if (numbers == null)
        {
            return null;
        }
        while (front < last)
        {
            int sum = numbers[front] + numbers[last];
            if (sum == target)
                return new int[]{front+1,last+1};
            else if (sum > target)
            {
                last--;
            }
            else
            {
                front++;
            }
        }
        return null;
    }

}
