package Arithmetic.Day07.Kruskal;

public class KruskalCase
{
    private int edgeNum;//边的个数
    private char[] vertex;//顶点数组
    private int[][] matrix;//邻接矩阵
    //使用 INF 表示两个顶点不能联通
    private static final int INF  = Integer.MAX_VALUE;
    public static void main(String[] args)
    {
        char[] vertexs = {'A','B','C','D','E','F','G'};
        int[][] matrix={
                {0,12,INF,INF,INF,16,14},
                {12,0,10,INF,INF,7,INF},
                {INF,10,0,3,5,6,INF},
                {INF,INF,3,0,4,INF,INF},
                {INF,INF,5,4,0,2,8},
                {16,7,6,INF,2,0,9},
                {14,INF,INF,INF,8,9,0}
        };
        KruskalCase kruskalCase = new KruskalCase(vertexs,matrix);
        kruskalCase.print();
    }

    //构造器
    public KruskalCase(char[] vertexs,int[][] matrix)
    {
        //初始化顶点数和边的个数
        int vlen = vertexs.length;

        //初始化顶点，复制拷贝的方式
        this.vertex = new char[vlen];
        for (int i =0;i < vertexs.length;i++)
        {
            this.vertex[i] = vertexs[i];
        }
        //初始化边，使用的是复制拷贝的方式
        this.matrix = new int[vlen][vlen];
        for (int i = 0; i < vlen;i++)
        {
            for (int j = 0;j < vlen;j++)
            {
                if (this.matrix[i][j] != INF)
                {
                    edgeNum++;
                }
            }
        }
    }

    public void kruskal()
    {

    }


    //打印邻接矩阵
    public void print()
    {
        System.out.println("邻接矩阵为:");
        for (int i = 0;i < vertex.length;i++)
        {
            for (int j = 0;j < vertex.length;j++)
            {
                System.out.printf("%d\t",matrix[i][j]);

            }
            System.out.println();
        }
    }

    /**
     *  功能: 对边进行排序处理，冒泡排序
     * @param edges 边的集合
     */
    private void sortEdges(EData[] edges)
    {

    }

    /**
     *
     * @param ch 顶点的值 比如"A","B";
     * @return 返回 ch 顶点对应的下标，如果找不到，返回 -1
     */
    private int getPosition(char ch)
    {
        return -1;
    }

    /**
     * 功能: 获取图中边，放到EData[]数组中，后面需要遍历该数组
     * 是通过martix 邻接矩阵来获取
     * EData[] 形式[["A","B",12],["B","F",7],....]
      * @return
     */
    private EData[] getEDges()
    {
        return null;
    }

    /**
     * 功能 :获取下标为i的顶点的终点，用于后面判断两个顶点的终点是否相同
     * @param ends 数组就是记录了各个顶点对应的终点是哪个，end数组是在遍历过程中，逐步形成
     * @param i 表示传入的顶点对应的下标
     * @return 返回的就是 下标为 i 的这个顶点对应的终点的下标，
     */
    private int getEnd(int[] ends,int i)
    {
        return  i;
    }
}
