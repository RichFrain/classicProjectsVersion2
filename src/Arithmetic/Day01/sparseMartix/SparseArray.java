package Arithmetic.Day01.sparseMartix;
/**
 * 二维数组转稀疏数组的思路
 * 1.遍历原始的二维数组，得到有效的数据个数sum
 * 2.根据sum就可以创建稀疏数组sparseArr int[sum+1][3]
 * 3.将二维数组的有效数据存入到 稀疏数组
 *
 * 稀疏数组转原始的二维数组的思路
 * 1.先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组，比如上面的chessArr2=int[11][11]
 * 2.在读取稀疏数组后几行的数据(从第二行开始)，并赋给原始的二维数组取
 */
public class SparseArray
{
    public static void main(String[] args)
    {
        /*
         1.创建一个原始的二维数组 11*11
          0表示么有棋子，1表示黑子 ，2表示篮子
         */
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("原始的二维数组:");
        for ( int[] row: chessArr1)
        {
            for (int data: row)
            {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        /*
           2.遍历二维数组，得到非0数的个数
         */
        int sum = 0;
        for (int i = 0; i < 11; i++)
        {
            for (int j = 0; j < 11; j++)
            {
               if (chessArr1[i][j] != 0)
               {
                   sum++;
               }
            }
        }
        System.out.println("二维数组的非0个数为:"+sum);
        /*
          3.创建对应的稀疏数组
         */
        int sprseArr[][] = new int[sum+1][3];
        sprseArr[0][0] = 11;//给稀疏数组赋值
        sprseArr[0][1] = 11;//给稀疏数组赋值
        sprseArr[0][2] = sum;//给稀疏数组赋值
        //遍历二维数组，将非0的值放到sparseArr中
        int count = 0;//赋值关键
        for (int i = 0; i < 11; i++)
        {
            for (int j = 0; j < 11; j++)
            {
                if (chessArr1[i][j] != 0)
                {
                    count++;
                    sprseArr[count][0] = i;
                    sprseArr[count][1] = j;
                    sprseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        System.out.println("得到的稀疏数组为:");
        for (int i = 0;i < sprseArr.length;i++)
        {
            System.out.printf("%d\t%d\t%d\t\n",sprseArr[i][0],sprseArr[i][1],sprseArr[i][2]);
        }

        /*
        将稀疏数组恢复为原始的二维数组
         */
        int chessArr2[][] = new int[sprseArr[0][0]][sprseArr[0][1]];
        for (int i = 1;i < sprseArr.length;i++)
        {
           chessArr2[sprseArr[i][0]][sprseArr[i][1]] = sprseArr[i][2];
        }
        System.out.println("恢复的二维数组为:");
        for (int i = 0; i < 11; i++)
        {
            for (int j = 0; j < 11; j++)
            {
                System.out.printf("%d\t",chessArr2[i][j]);
            }
            System.out.println();
        }

    }
}
