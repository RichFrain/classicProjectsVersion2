package Arithmetic.Day07.prim;

public class MGraph
{
    int verxs;//表示图的节点个数
    char[] data ;//存放节点数据
    int[][] weight;//存放边

    public MGraph(int verxs)
    {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}
