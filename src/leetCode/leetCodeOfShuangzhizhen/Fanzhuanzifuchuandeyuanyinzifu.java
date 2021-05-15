package leetCode.leetCodeOfShuangzhizhen;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Given s = "leetcode", return "leotcede".
 */
public class Fanzhuanzifuchuandeyuanyinzifu
{
    private final static HashSet<Character> vowels = new HashSet<Character>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public static void main(String[] args)
    {


       String s = "leetcode";
//        System.out.println(s.charAt(5));
        System.out.println(reverseVowels(s));
    }

    /*
      使用双指针，一个指针从头向尾遍历，一个指针从尾到头遍历，
      当两个指针都遍历到元音字符时，交换这两个元音字符。
     */
    public static String reverseVowels (String s)
    {
        int i = 0;
        int j = s.length() - 1;
        char[] result = new char[s.length()];
        if (s == null)
        {
            return null;
        }
        while (i <= j)
        {
            char ci = s.charAt(i);
            char cj  = s.charAt(j);
            if (!vowels.contains(ci))
            {
                result[i++] = ci;
            }
            else if (!vowels.contains(cj))
            {
                result[j--] = cj;
            }
            else
            {
              result[i++] = cj;
              result[j--] = ci;
            }
        }
        return new String(result);
    }
}
