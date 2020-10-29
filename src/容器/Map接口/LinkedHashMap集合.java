package 容器.Map接口;

import java.util.LinkedHashMap;

/*
* java.util.
* LinkedHashMap<k , v>集合extends HashMap<k, v>集合
*
linkedHashAap的特点:
1.LinkedHashNap集合底层是哈希表+链表(双链保证迭代的顺序)
2.LinkedHashMAap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
* */
public class LinkedHashMap集合 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("Max","Min");
        map.put("Hello","M");
        map.put("Hello","Monica");
        map.put("hello","Monica");

        System.out.println(map);//有序，底层哈希表+链表(双链)


    }
}
