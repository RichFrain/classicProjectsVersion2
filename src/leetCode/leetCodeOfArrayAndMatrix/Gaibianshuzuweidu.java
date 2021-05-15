package leetCode.leetCodeOfArrayAndMatrix;
/**
 * 改变数组维度
 *Input:
 * nums =
 * [[1,2],
 *  [3,4]]
 * r = 1, c = 4
 *
 * Output:
 * [[1,2,3,4]]
 */
public class Gaibianshuzuweidu
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][4];
        for (int i = 0; i < 3; i++)
        {
            for (int i1 = 0; i1 < 4; i1++)
            {
                arr[i][i1] = (int)(Math.random()*10);
            }
        }
        System.out.println("矩阵改变前:");
        for (int i = 0; i < 3; i++)
        {
            for (int i1 = 0; i1 < 4; i1++)
            {
                System.out.printf("%d\t",arr[i][i1]);
            }
            System.out.printf("\n");
        }
        System.out.println("矩阵改变后:");
         int[][] arr2  = new int[2][6];
          arr2 = matrixReshape(arr,2,6);
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.printf("%d\t",arr2[i][j]);
            }
            System.out.printf("\n");
        }


    }

    public static int[][] matrixReshape(int[][] nums,int r,int c)
    {
        int m = nums.length;//一共几行
        int  n = nums[0].length;//第一行共几个数
        if (m * n != r * c)
        {
            return nums;
        }
        int[][] reshapeNums  = new int[r][c];
        int index = 0;
        for (int i =0;i < r;i++)
        {
            for (int j = 0;j < c;j++)
            {
                reshapeNums[i][j] = nums[index / n][index % n];
                index++;
            }
        }
        return reshapeNums;
    }
}
