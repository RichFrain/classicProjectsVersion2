package Arithmetic.Day01.linkedList.singleLinkedList;

public class HeroNode
{
    public int no;
    public String name;
    public String nikeName;
    public HeroNode next;

    public HeroNode(int no, String name, String nikeName)
    {
        this.no = no;
        this.name = name;
        this.nikeName = nikeName;

    }


    //为了显示英雄，我们重写toString
    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName +
                '}';
    }
}
