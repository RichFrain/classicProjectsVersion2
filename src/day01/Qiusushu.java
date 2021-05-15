package day01;

public class Qiusushu
{
    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 101; i <=200 ; i++)
        {
          if (i % 2 != 0)
          {
              sum++;
              System.out.println(i);
          }

        }
        System.out.println("101到200之间共计有: "+sum+"个素数");
    }
}
