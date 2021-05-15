package Arithmetic.Day07.bruteForce;

import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<int[][]> list = new ArrayList<int[][]>();
        int[][] arr = new int[5][2];
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                     arr[i][j] = (int)(Math.random()*10);

            }
        }

        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.printf("\n");
        }
       int[] arr2 = {1,2,3,4};
        //list.add(arr2);
    }
}
