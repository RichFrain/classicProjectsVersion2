package Arithmetic.Day01.linkedList.singleLinkedList;

public class SingelLinkedList
{
    public static void main(String[] args)
    {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //创建链表
        SingleLinkedListOperation singleLinkedListOperation = new SingleLinkedListOperation();
        //加入
//        singleLinkedListOperation.add(hero1);
//        singleLinkedListOperation.add(hero3);
//        singleLinkedListOperation.add(hero4);
//        singleLinkedListOperation.add(hero2);
        //按编号顺序加入
        singleLinkedListOperation.addByOrder(hero1);
        singleLinkedListOperation.addByOrder(hero3);
        singleLinkedListOperation.addByOrder(hero2);
        singleLinkedListOperation.addByOrder(hero4);

       // 修改节点
//        HeroNode newHeroNode = new HeroNode(1, "小灰灰", "灰太狼");
//        singleLinkedListOperation.update(newHeroNode);
         //删除节点
//        singleLinkedListOperation.del(3);
        //显示
        singleLinkedListOperation.list();
        //链表反转
//        singleLinkedListOperation.reverseLinkedList();
        //显示
//        singleLinkedListOperation.list();
        //统计节点个数
//        singleLinkedListOperation.getCount();
        //查找单链表中的倒数第K个节点

        //

    }
}
