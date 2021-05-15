package Arithmetic.Day07.prim;
/**
 * 普利姆算法
 */
public class PrimAlgorithm
{
    public static void main(String[] args)
    {
          char[] data  = new char[]{'A','B','C','D','E','F','G'};
          int verxs = data.length;
          //邻接矩阵的关系使用二维数组表示，10000这个大数，表示两个点不连通
        int[][] weght = new int[][]
                {
                        {10000,5,7,10000,10000,10000,2},
                        {5,10000,10000,9,10000,10000,3},
                        {7,10000,10000,10000,8,10000,10000},
                        {10000,9,10000,10000,10000,4,10000},
                        {10000,10000,8,10000,10000,5,4},
                        {10000,10000,10000,4,5,10000,6},
                        {2,3,10000,10000,4,6,10000}
                };
        //创建MGraph对象
        MGraph mGraph = new MGraph(verxs);
        //创建MinTree对象
        MinTree minTree = new MinTree();
        minTree.createGraph(mGraph,verxs,data,weght);
        minTree.showGraph(mGraph);
        minTree.prim(mGraph,1);

    }
}
