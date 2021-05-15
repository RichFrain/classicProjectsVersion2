package leetCode.leetCodeOfArrayAndMatrix;
/**
 * 找出数组中最长的连续的1
 * 数组只包含0 1
 */
public class Zhaochushuzuzhongzuichangdelainxu1
{
    public static void main(String[] args)
    {
        int[] arr = {0,1,0,1,0,1,1,1,1};
        System.out.println(findMaxConsectuiveOnes(arr));

    }

    public static int findMaxConsectuiveOnes(int[] arr)
    {
        int max =0;
        int cur =0;
        for (int i = 0;i < arr.length;i++)
        {
            if (arr[i] != 0)

            {
                cur++;
            }
            else
            {
                cur = 0;
            }
            if (cur > max)
            {
                max = cur;
            }
        }
        return max;
    }

}
