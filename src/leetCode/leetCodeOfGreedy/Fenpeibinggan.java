package leetCode.leetCodeOfGreedy;
import java.util.Arrays;

/**
 *题目描述：有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。
 * 每个孩子只能吃一个饼干，且只有饼干的大小不小于孩子的饥饿度时，这个孩子才能吃饱。
 * 求解最多有多少孩子可以吃饱。
 *
 * 每个孩子都有一个满足度 grid，每个饼干都有一个大小 size，
 * 只有饼干的大小大于等于一个孩子的满足度，该孩子才会获得满足。
 * 求解最多可以获得满足的孩子数量。
 * 1. 给一个孩子的饼干应当尽量小并且又能满足该孩子，这样大饼干才能拿来给满足度比较大的孩子。
 * 2. 因为满足度最小的孩子最容易得到满足，所以先满足满足度最小的孩子。
 *
 有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。每个孩子只能吃
 一个饼干，且只有饼干的大小不小于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩子
 可以吃饱。
 * Input: grid[1,3], size[1,2,4]
 * Output: 2
 */
public class Fenpeibinggan
{
    public static void main(String[] args)
    {
        int[] grid = {3,4,1};
        int[] size = {1,2,4,5};
        System.out.println(findContentChildren(grid,size));

    }
     /*
       思路:
        每次用最小的饼干，分配给最不饿的小孩，达到资源的最大利用率
        贪心策略是: 给剩余小孩的最小饥饿度的孩子分配最小的饱腹的饼干
      */
    public static int findContentChildren(int[] grid,int[] size)
    {
        if (grid == null || size == null)
        {
            return 0;
        }
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0, si = 0;
        while (gi < grid.length && si < size.length)//还有孩子或者饼干没有分配完，则继续
        {
            if (grid[gi] <= size[si])// 每次给最小饥饿度的孩子分配最小的能饱腹的饼干
            {
                gi++;//分配
            }
            si++;// 刚好合适，当前饼干被吃掉，则下一个饼干，或者饼干过小，
                   // 则后面任何孩子也满足不了，也相当于被消耗，则下一个饼干。
        }
        return gi;
    }
}
