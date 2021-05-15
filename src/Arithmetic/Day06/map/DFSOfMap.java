package Arithmetic.Day06.map;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * 递归的过程
 * 优先从纵向挖掘深入。不是对每一个节点的所有邻接节点进行横向访问
 *
 */
public class DFSOfMap
{
    private ArrayList<String> vertexList;//存储顶点集合
    private int[][] edges;//存储图相应的领接矩阵
    private int numOfEdges;//表示边的数目
    private boolean[] isVisited;//记录某个节点是否被访问
    public static void main(String[] args)
    {
        int n = 5;//节点个数
        String vertexs[] = {"A","B","C","D","E"};
        DFSOfMap dfsOfMap = new DFSOfMap(n);
        //循环添加顶点
        for (int i = 0;i < vertexs.length;i++)
        {
            dfsOfMap.insertVertex(vertexs[i]);
        }
        //添加边
        dfsOfMap.insertEdge(0,1,1);
        dfsOfMap.insertEdge(0,2,1);
        dfsOfMap.insertEdge(1,2,1);
        dfsOfMap.insertEdge(1,3,1);
        dfsOfMap.insertEdge(1,4,1);
        dfsOfMap.showGraph();

        System.out.println("深度遍历");
        dfsOfMap.dfs();

    }
    public DFSOfMap(int n)
    {
        //初始化矩阵和vertexList
        vertexList = new ArrayList<String>(n);
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
    }
    //得到第一个邻接点的下标
     public int getFirstNeighbor(int index)
     {
         for (int j =0; j < vertexList.size();j++)
         {
             if (edges[index][j] > 0)
             {
                 return j;
             }
         }
         return -1;
     }
     //根据前一个邻接点的下标获取下一个邻接点
    public int getNextNeighbor(int v1,int v2)
    {
        //v1 v2是前一个邻接节点的下标
        for (int j = v2 + 1; j < vertexList.size();j++)
        {
            if (edges[v1][j] > 0)
            {
                return j;
            }
        }
        return  -1;
    }
    //深度优先遍历算法
   public void dfs(boolean[] isVisited,int i)
   {
       //首先访问该节点，输出
       System.out.print(getValueByIndex(i)+"->");
       //将节点设置为已经访问
       isVisited[i] = true;
       //查找节点i 的第一个邻接节点w
       int w =getFirstNeighbor(i);
       while (w != -1)//说明有
       {
           if (!isVisited[w])
           {
               dfs(isVisited,w);
           }
           w = getNextNeighbor(i,w);//如果节点w 已经被访问过了
       }
   }
     //对dfs进行一个重载，遍历所有的节点，并进行dfs
    public void dfs()
    {
        isVisited = new boolean[vertexList.size()];
        //遍历所有节点，进行dfs[回溯]
        for (int i = 0;i < getNumOfVertex();i++)
        {
            if (!isVisited[i])
            {
                dfs(isVisited,i);
            }
        }
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
