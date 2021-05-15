package leetCode.leetCodeOfGreedy;
/**
 *
 题目描述：一次股票交易包含买入和卖出，只进行一次交易，求最大收益。

 输入：[7,1,5,3,6,4]
 输出：5
 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。

 输入：prices = [7,6,4,3,1]
 输出：0
 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 */
public class MaiimaigupiaozuidadeshouyiVersion1
{
    public static void main(String[] args)
    {
      int[] price = {7,1,5,3,6,4};
      int[] price2 = {7,6,4,3,1};
      System.out.println(maxProfit(price2));
    }

    /**
     * 只要记录前面的最小价格，将这个最小价格作为买入价格，然后将当前的价格作为售出价格，
     * 查看当前收益是不是最大收益
     */
    public static int maxProfit(int[] prices)
    {
        int n = prices.length;
        if (n == 0)
        {
            return 0;
        }
        int soFarMin = prices[0];
        int max= 0;
        for (int i =1;i < n;i++)
        {
            if (soFarMin > prices[i])
                soFarMin = prices[i];
            else
            {
                max = Math.max(max,prices[i] - soFarMin);
            }
        }
        return max;
    }
}
