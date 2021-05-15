package Arithmetic.Day07.characterMatch;

public class ViolenceMatch
{
    public static void main(String[] args)
    {
        String string1 = "AAAAAABBBBBBCCCCDDD";
        String string2 = "BCCCC";
        System.out.println( violenceMatch(string1,string2));

    }

    public static int violenceMatch(String str1,String str2)
    {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();

        int s1len = s1.length;
        int s2len = s2.length;

        int i = 0,j = 0;
        while (i < s1.length && j < s2.length)//保证匹配不越界
        {
            if (s1[i] == s2[j])//匹配成功
            {
                i++;
                j++;
            }
            else
            {
                i = i - j + 1;
                j = 0;
            }
        }
        //判断是否匹配成功
        if (j == s2len)
        {
            return  i - j;
        }
        else
        {
            return -1;
        }
    }
}
