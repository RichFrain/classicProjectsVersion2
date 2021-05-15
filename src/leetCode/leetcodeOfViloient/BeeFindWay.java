package leetCode.leetcodeOfViloient;
/**
 * 暴力破解
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BeeFindWay {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        Scanner scanner = new Scanner(System.in);
        //将所有坐标存入数组
        for (int i = 0; i < 5; i++)
        {
            int[] arraytemp = new int[2];
            for (int j = 0; j < 2; j++)
            {
                arraytemp[j] = scanner.nextInt();
            }
            //将每对坐标存入 ArrayList
            list.add(arraytemp);
        }
        System.out.println(list.get(0)[0]);
        //每段距离的存储变量
        double ln1 = 0;
        double ln2 = 0;
        double ln3 = 0;
        double ln4 = 0;
        double ln5 = 0;
        double ln6 = 0;
        double sum = 0;
        //存储每一条的路径的总距离
        ArrayList<Double> listSum = new ArrayList<Double>();
        //暴力检索
        for (int i = 0; i < 5; i++) {
            //求出第一段距离
            ln1 = Math.sqrt(Math.pow(list.get(i)[0], 2) + Math.pow(list.get(i)[1], 2));
            //求第二段距离
            for (int i1 = 0; i1 < 5; i1++) {
                //排除与之重复的坐标
                if (list.get(i1) == list.get(i)) {
                    continue;
                } else {
                    ln2 = Math.sqrt(Math.pow(list.get(i1)[0] - list.get(i)[0], 2));
                }
                //求出第三段距离
                for (int i2 = 0; i2 < 5; i2++) {
                    //排除与之重复的坐标
                    if (list.get(i2) == list.get(i1) || list.get(i2) == list.get(i)) {
                        continue;
                    } else {
                        ln3 = Math.sqrt(Math.pow(list.get(i2)[0] - list.get(i1)[0], 2) + Math.pow(list.get(i2)[1] - list.get(i1)[1], 2));
                    }
                    //求出第四段距离
                    for (int i3 = 0; i3 < 5; i3++)
                    {
                        //排除与之重复的坐标
                        if (list.get(i3) == list.get(i2) || list.get(i3) == list.get(i1) || list.get(i3) == list.get(i)) {
                            continue;
                        } else {
                            ln4 = Math.sqrt(Math.pow(list.get(i3)[0] - list.get(i2)[0], 2) + Math.pow(list.get(i3)[1] - list.get(i2)[1], 2));
                        }
                        //求出第五段距离
                        for (int i4 = 0; i4 < 5; i4++)
                        {
                            //排除与之重复的坐标
                            if (list.get(i4) == list.get(i3) || list.get(i4) == list.get(i2) || list.get(i4) == list.get(i1) || list.get(i4) == list.get(i)) {
                                continue;
                            }
                            else {
                                ln5 = Math.sqrt(Math.pow(list.get(i4)[0] - list.get(i3)[0], 2) + Math.pow(list.get(i4)[1] - list.get(i3)[1], 2));
                            }
                            //求出第六段距离
                            ln6 = Math.sqrt(Math.pow(list.get(i4)[0], 2) + Math.pow(list.get(i4)[1], 2));
                            sum = ln1 + ln2 + ln3 + ln4 + ln5 + ln6;
                            listSum.add(sum);
                        }
                    }
                }
            }
        }
        Collections.sort(listSum);
        double num;
        num = listSum.get(0);
        int result = (int)num ;
        System.out.println(result);
        scanner.close();
    }
}