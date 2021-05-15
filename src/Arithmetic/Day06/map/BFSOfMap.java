package Arithmetic.Day06.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BFSOfMap
{
        private ArrayList<String> vertexList;//存储顶点集合
        private int[][] edges;//存储图相应的领接矩阵
        private int numOfEdges;//表示边的数目
        private boolean[] isVisited;//记录某个节点是否被访问
        public static void main(String[] args)
        {
            int n = 5;//节点个数
            String vertexs[] = {"A","B","C","D","E"};
            BFSOfMap bfsOfMap = new BFSOfMap(n);
            //循环添加顶点
            for (int i = 0;i < vertexs.length;i++)
            {
                bfsOfMap.insertVertex(vertexs[i]);
            }
            //添加边
            bfsOfMap.insertEdge(0,1,1);
            bfsOfMap.insertEdge(0,2,1);
            bfsOfMap.insertEdge(1,2,1);
            bfsOfMap.insertEdge(1,3,1);
            bfsOfMap.insertEdge(1,4,1);
            bfsOfMap.showGraph();
            System.out.println("广度遍历");
            bfsOfMap.bfs();
        }
    public BFSOfMap(int n)
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
        for (int j = v2 + 1; j < vertexList.size();j++)
        {
            if (edges[v1][j] > 0)
            {
                return j;
            }
        }
        return  -1;
    }
        //广度优先遍历
       private void bfs(boolean[] isVisited,int i)
       {
           int u;//表示队列的头结点下标
           int w;//邻接节点w
           LinkedList<Object> queue = new LinkedList<>();//队列，记录节点访问的顺序
           System.out.print(getValueByIndex(i)+"=>");//访问节点，输出节点信息
           isVisited[i] = true;//将节点加入队列
           queue.addLast(i);
           while (!queue.isEmpty())
           {
               u  = (Integer)queue.removeFirst();//取出队列的头结点下标
               w = getFirstNeighbor(u);//得到第一个邻接点得下标w
               while (w != -1)//找到
               {
                   if (!isVisited[w])//是否访问过
                   {
                       System.out.print(getValueByIndex(w)+"=>");
                       isVisited[w] = true;//标记已经访问过
                       queue.addLast(w);//入队
                   }
                   //体现广度优先
                   w = getNextNeighbor(u,w);//以u为前驱节点，找w后面的下一个节点
               }
           }
       }
      //遍历所有节点，都进行广度优先搜索
    public  void bfs()
    {
       isVisited = new boolean[vertexList.size()];
       for (int i =0;i < getNumOfVertex();i++)
       {
           if (!isVisited[i])
           {
               bfs(isVisited,i);
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

