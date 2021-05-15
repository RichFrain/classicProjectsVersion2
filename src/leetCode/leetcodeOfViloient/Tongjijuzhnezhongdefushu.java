package leetCode.leetcodeOfViloient;
/**
 * 给你一个 m * n的矩阵 grid, 矩阵中的元素无论是按行还是按列，都以非递增顺序排列
 * 请你统计并返回 frid 中负数的数目
 * grid =
 * [
 * [1,-1],
 * [-1,-1]
 * ]
 * 输出 :3
 */
public class Tongjijuzhnezhongdefushu
{
    public static void main(String[] args)
    {
      int[][] arr ={
              {-1,-1,0},
              {2,-1,-1}
      };
//        for (int i = 0; i < 2; i++)
//        {
//            for (int j = 0; j < 3; j++)
//            {
//                System.out.printf("%d\t",arr[i][j]);
//            }
//            System.out.println();
        //}
        System.out.println(countNegatives(arr));

    }
    public static int countNegatives(int[][] arr)
    {
        int count = 0;
        for (int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[0].length;j++)
            {
                if (arr[i][j] < 0)
                {
                    count++;
                }
            }
        }
        return count;
    }

}
