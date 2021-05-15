package Arithmetic.Day01.linkedList.DoubleLinkedList;

public class DoubleLinkedList
{
    public static void main(String[] args)
    {
        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");

        //创建链表
        DoubleLinkedListOperation doubleLinkedListOperation = new DoubleLinkedListOperation();
        doubleLinkedListOperation.add(hero1);
        doubleLinkedListOperation.add(hero2);
        doubleLinkedListOperation.add(hero3);
        doubleLinkedListOperation.add(hero4);
        doubleLinkedListOperation.list();
    }
}
