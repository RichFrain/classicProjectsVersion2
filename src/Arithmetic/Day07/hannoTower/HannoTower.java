package Arithmetic.Day07.hannoTower;

public class HannoTower
{
    public static void main(String[] args)
    {

    }

    public static void hannoTower(int num, char a, char b, char c)
    {
        if (num == 1)//如果只有一个盘
        {

            System.out.println("第一个盘"+a+"->+"+c);
        }
        else //如果有两个盘以上
        {
            //1 先把最上面的所有盘 A -> B,移动过程会使用到C
            hannoTower(num - 1,a,c,b);
            //2. 把最下边的盘 A -> C
            System.out.println("第"+num+"个盘"+a+"->"+c);
            //3 把B塔的所有盘从B -> C,移动过程使用到A塔
            hannoTower(num - 1,b,a,c);

        }

    }
}
