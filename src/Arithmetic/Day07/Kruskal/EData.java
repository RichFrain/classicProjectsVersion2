package Arithmetic.Day07.Kruskal;
//创建一个类EData,它的对象实例就表示一条边
public class EData
{
    char start;//边的一个点
    char end;//边的另外一个点
    int weight;//边的权值

    public EData(char start, char end, int weight)
    {
        this.start = start;
        this.end = end;
        this.weight = weight;

    }

    @Override
    public String toString()
    {
        return "EData[<+"+start+","+end+">="+weight;
    }
}
