package day02;

public class Demo04
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 4; i++)//控制前4行
        {
            for (int j = 0; j <2 - i ; j++)//打印空格
            {
                System.out.printf("h");
            }
            for (int k = 0; k <= 2*i ; k++)//打印*号
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++)//控制后3行
        {
            for (int j = 0; j <= i ; j++)//打印
            {
                System.out.printf("h");
            }
            for (int k = 0; k <= 4 - 2 * i ; k++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println("----------");
        for (int i = 4; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
