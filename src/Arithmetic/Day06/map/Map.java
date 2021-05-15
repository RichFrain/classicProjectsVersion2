package Arithmetic.Day06.map;
import java.util.ArrayList;
import java.util.Arrays;


public class Map
{
    private ArrayList<String> vertexList;//存储顶点集合
    private int[][] edges;//存储图相应的领接矩阵
    private int numOfEdges;//表示边的数目

    public static void main(String[] args)
    {
        int n = 5;//节点个数
        String vertexs[] = {"A","B","C","D","E"};
        //创建图对象
        Map map = new Map(n);
        //循环添加顶点
        for (int i = 0;i < vertexs.length;i++)
        {
            map.insertVertex(vertexs[i]);
        }
        //添加边
        map.insertEdge(0,1,1);
        map.insertEdge(0,2,1);
        map.insertEdge(1,2,1);
        map.insertEdge(1,3,1);
        map.insertEdge(1,4,1);
        map.showGraph();
        System.out.println(map.getValueByIndex(0));
    }

    public Map(int n)
    {
        //初始化矩阵和vertexList
        vertexList = new ArrayList<String>(n);
        edges = new int[n][n];
        numOfEdges = 0;
    }

    //显示图对应的矩阵
    public void showGraph()
    {
        for (int[] link : edges)
        {
            System.out.println(Arrays.toString(link));
        }
    }

    //返回节点个数
    public int getNumOfVertex()
    {
        return vertexList.size();
    }

    //得到边的数目
    public int getNumOfEdges()
    {
        return  numOfEdges;
    }

    //返回节点i(下标)对应的数据
    public String getValueByIndex(int i)
    {

        return vertexList.get(i);
    }


    //返回 v1 和 v2 间的权值
    public int getWeight(int v1,int v2)
    {

        return  edges[v1][v2];
    }

    //插入节点
    public void insertVertex(String vertex)
    {

        vertexList.add(vertex);
    }

    //添加边

    /**
     *
     * @param v1 表示点的下标即第几个顶点，A -> B : A -> 0, B -> 1
     * @param v2 第二个顶点对应的下标
     * @param weight
     */
     public void insertEdge(int v1,int v2,int weight)
     {
         edges[v1][v2] = weight;
         edges[v2][v1] = weight;
         numOfEdges++;
     }
}
