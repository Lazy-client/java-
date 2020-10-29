package 容器.Map接口;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* java.util.HashMap<k, v>集合imptements Map<k , v>接口HashMap集合的特点:
1.HashMap集合底层是哈希表:查询的速度特别的快
      JDK1.8之前:数组+单向链表
3.JDK1.8之后:数组+单向链表/红黑树(链表的长度超过8):提高查询的速度
* 2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
* java.util.LinkedHashMap<k , v>集合extends HashMap<k, v>集合
* */
public class HashMap集合 {
    public static void main(String[] args) {
       methodPut();
    }
    public  static void methodPut(){
        HashMap<String, String> map = new HashMap<>();
        map.put("Mary","Jack");
        map.put("show","out");
        map.put("Hello","Monica");
        map.put("show","out");
        System.out.println(map);//无序，key不能重复

        map.put("Hello","Sensei");
       /* System.out.println(map);//key相同，value覆盖原value值
        String remove = map.remove("show");//按key移除集合元素，返回value的值

        System.out.println(map+remove);

        boolean hello = map.containsKey("Hello");//判断集合是否含有key=“Hello”的元素，返回boolean
        boolean monica = map.containsValue("Monica");*/

        Set<String> set = map.keySet();
        for (String s : set) {
            String value = map.get(s);
            System.out.println(value);

        }

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> the : entrySet) {
            System.out.println(the.getValue()+"+"+the.getKey());
        }


    }

}
