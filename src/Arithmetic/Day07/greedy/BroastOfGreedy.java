package Arithmetic.Day07.greedy;

/**
 * 1. 遍历所有的广播电台，找到一个覆盖最多的未覆盖地区的电台
 * 2. 将这个电台加入到一个 集合中，想办法把该电台覆盖的地区在下次比较时去掉
 * 3. 重复第1步 知道覆盖了全部的地区
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BroastOfGreedy
{
    public static void main(String[] args)
    {
        //创建广播电台，放到Map
        HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();
        //将各个电台放入到broadcasts
        HashSet<String> hashSet1 = new HashSet<String>();
        hashSet1.add("北京");
        hashSet1.add("上海");
        hashSet1.add("天津");
        HashSet<String> hashSet2  =  new HashSet<String>();
        hashSet2.add("广州");
        hashSet2.add("北京");
        hashSet2.add("深圳");
        HashSet<String> hashSet3  =  new HashSet<String>();
        hashSet3.add("成都");
        hashSet3.add("上海");
        hashSet3.add("杭州");
        HashSet<String> hashSet4  =  new HashSet<String>();
        hashSet4.add("上海");
        hashSet4.add("天津");
        HashSet<String> hashSet5  =  new HashSet<String>();
        hashSet5.add("杭州");
        hashSet5.add("大连");
        //加入到map
        broadcasts.put("K1",hashSet1);
        broadcasts.put("K2",hashSet2);
        broadcasts.put("K3",hashSet3);
        broadcasts.put("K4",hashSet4);
        broadcasts.put("K5",hashSet5);
        //allAreas 存放所有的地区
         HashSet<String> allAreas  =new HashSet<String>();
         allAreas.add("北京");
        allAreas.add("上海");
        allAreas.add("天津");
        allAreas.add("广州");
        allAreas.add("深圳");
        allAreas.add("成都");
        allAreas.add("杭州");
        allAreas.add("大连");
       // System.out.println(broadcasts.keySet());
        //存放选择的电台集合
        ArrayList<String> selects = new ArrayList<>();
        //定义一个临时集合，在遍历过程中，存放遍历过程中的电台覆盖的地区和还没有覆盖的地区的交集
        HashSet<String> tempSet  =  new HashSet<String>();

         //定义给 maxKey,保存在一次遍历过程中，能够覆盖最大未覆盖的地区对应的电台key
         //如果 maxKey 不为 null,则会加入到 selects
        String maxKey = null;
        while (allAreas.size() != 0)//如果allArea 不为0，则表示还没有覆盖到所有地区
        {
            maxKey = null;//每进行一次

            for (String key : broadcasts.keySet())//遍历broadcasts，取出对应的key
            {
                tempSet.clear();//每进行一次for前先清空
                HashSet<String> areas = broadcasts.get(key);//当前key能够覆盖的地区
                tempSet.addAll(areas);
                tempSet.retainAll(allAreas);//求出tempSet 和 allAreas 集合地交集，交集赋给tempSet
                //如果当前这个集合包含的未覆盖的地区的数量， 比maxKey指向的集合地区还要多
                //就需重置 maxKey
                //tempSet.size() > broadcasts.get(maxKey).size() 体现出贪心算法的特点，每次都选择最优的
                if (tempSet.size() > 0 && (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {
                    maxKey = key;
                }
            }
            if (maxKey != null)//maxKey != null,就应该将maxKey加入到 selects
            {
                selects.add(maxKey);
                allAreas.removeAll(broadcasts.get(maxKey));//将maxKey 指向的电台覆盖地区从allArea去掉
            }
        }
        System.out.println(selects);
    }
}
