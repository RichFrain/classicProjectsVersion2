package Arithmetic.Day01.linkedList.DoubleLinkedList;

public class HeroNode2
{
    public int no;
    public String name;
    public String nikeName;
    public HeroNode2 next;//指向下一个节点，默认为null
    public HeroNode2 pre;//指向前一个节点，默认为null

    public HeroNode2(int no, String name, String nikeName)
    {
        this.no = no;
        this.name = name;
        this.nikeName = nikeName;

    }
    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}
