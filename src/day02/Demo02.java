package day02;

public class Demo02
{
    public static void main(String[] args)
    {
         int i, j, k;
        for (i = 1;  i< 5; i++)
        {
            for ( j = 1; j < 5; j++)
            {
                for (k = 1;  k< 5; k++)
                {
                  if (i != k && i != j &&  j!= k)
                  {
                      System.out.print(i);
                      System.out.print(j);
                      System.out.print(k);
                  }

                }
            }
        }
    }
}
