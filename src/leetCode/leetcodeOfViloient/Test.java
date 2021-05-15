package leetCode.leetcodeOfViloient;
import java.util.ArrayList;
import java.util.Scanner;


public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<int[]> list = new ArrayList<int[]>();
      //  int j , r ;
        /**
         *  j  + r = 35;
         *  2*j + 4*r = 94;
         */
//
//        for (j = 1;j <= 35;j++)
//        {
//            for (r =1;r < 35;r++)
//            {
//                if ((2*j + 4*r == 94) && (j + r == 35 ))
//                {
//                    System.out.println(j +" " +r);
//                }
//            }
//
//        }
        for (int i = 0; i < 5; i++)
        {
            int[] arr=  new int[2];
            for (int j = 0; j < 2; j++)
            {
                arr[j] = scanner.nextInt();
            }
            list.add(arr);
        }
        System.out.println(list.get(0)[1]);

//        for ( j = 1;j < 35;j++)
//        {
//            r = 35 - j;
//            if (2*j + 4*r == 94)
//            {
//                System.out.println(j+" "+r);
//            }
//        }
    }
}
