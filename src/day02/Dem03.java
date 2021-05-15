package day02;

public class Dem03
{
    public static void main(String[] args)
    {
       int i, j;
        for ( i = 1; i <= 9; i++)
        {
            for ( j = 1; j <=i; j++)
            {

                System.out.printf(i+"*"+j+"="+i*j);
            }

            System.out.println();
        }
    }
}
