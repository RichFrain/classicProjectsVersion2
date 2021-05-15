package Arithmetic.Day07.characterMatch;

import java.util.Arrays;

/**
 * KMP算法
 * 主串的指针 i 不必回溯
 * 模式串的指针 j  = next[j]
 */
public class KmpOfMatch
{
    public static void main(String[] args)
    {
        String s1 = "DDDDDAAAAAAAANJKJLKJ";
        String s2 = "abcaabbc";
        int[] next = kmpNext("ANJKJ");
        System.out.println("next="+ Arrays.toString(next));
//        System.out.println(kmpSearch(s1,s2,next));



    }
    //kmp算法
    public static int kmpSearch(String str1,String str2,int[] next)
    {
        //遍历
        for (int i = 0, j = 0; i < str1.length();i++)
        {
            //需要处理 str1.charAt(i) != str2.charAt(j),去调整j的大小
            //kmp算法的核心
            while (j > 0 && str1.charAt(i) != str2.charAt(j))
            {
                j = next[j - 1];
            }
            if (str1.charAt(i) == str2.charAt(j))
            {
                j++;
            }
            if (j == str2.length())//找到了
            {
                return i - j +1;
            }
        }
      return -1;
    }

    //获取到一个字符串(子串)的部分匹配值表
    public static int[] kmpNext(String dest)
    {
        //创建一个 next 数组保存比分匹配值
        int[] next = new int[dest.length()];
        next[0] = 0;//如果字符串长度为1，部分匹配值就是 0
        for (int i = 1, j = 0; i < dest.length();i++)
        {
            //当dest.charAt(i) != dest.charAt(i),我们需要从next[j -1] 获取新的j
            //直到我们发现有 dest.charAt(i) == dest.charAt(j) 成立才退出
            //这时kmp的算法的核心点
            while (j > 0 && dest.charAt(i) != dest.charAt(j))
            {
                j = next[j - 1];
            }
            //当dest.charAt(i) == destCharAt(j) 满足时，部分匹配值就是 +1
            if (dest.charAt(i) == dest.charAt(j))
            {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
