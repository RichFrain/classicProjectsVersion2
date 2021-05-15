package leetCode.leetCodeOfShuangzhizhen;
/**
 * Input: "abca"
 * Output: True
 * Explanation: You could delete the character 'c'.
 */

public class Huiwenzifuchuan
{
    public static void main(String[] args)
    {
        String temp = "abca";
        System.out.println(validPar(temp));
    }

    /*
    使用双指针可以很容易判断一个字符串是否是回文字符串：
    令一个指针从左到右遍历，一个指针从右到左遍历，
    这两个指针同时移动一个位置，每次都判断两个指针指向的字符是否相同，
    如果都相同，字符串才是具有左右对称性质的回文字符串。
     */
     public static boolean validPar(String s)
     {
         for (int i = 0, j = s.length()-1;i < j;i++,j--)
         {
             if (s.charAt(i) != s.charAt(j))
             {
                 return isHiwen(s,i,j-1) || isHiwen(s,i+1,j);
             }
             else
             {
                 System.out.println("是回文串");
                 return true;
             }
         }
         return false;
     }


    public static boolean isHiwen(String s,int i,int j)
    {
        while (i < j)
        {
            if (s.charAt(i) == s.charAt(j))
            {
                return true;
            }
            i++;
            j++;
        }
        return false;
    }
}
