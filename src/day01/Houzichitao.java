package day01;

public class Houzichitao
{
    public static void main(String[] args)
    {
        double sn = 100.0,hn = sn/2;
        for (int i = 2; i <= 10; i++)
        {
           sn = sn +2*hn;/*第n次落地时共经过的米数*/
           hn = hn/2;/*第n次反跳高度*/
        }
        System.out.println("球所经过的路程为:"+sn+"米");
        System.out.println("第10次反弹调度为:"+hn+"米");
    }
}
