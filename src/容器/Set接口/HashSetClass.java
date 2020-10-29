package 容器.Set接口;

import java.util.HashSet;
import java.util.Set;

/*
* Hashset特点:(implements Set)
1.不允许存储重复的元素
2.没有索引,没有带素引的方法,也不能使用普通的for循环遍历
3.是一个无序的集合,存储元素和取出元素的顺序有可能不一致
4.底层是一个哈希表结构(查询的速度非常的快)
*
* */
public class HashSetClass {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(123);
        integers.add(312);
        integers.add(123);
        System.out.println(integers);//无序，不允许存储相同元素
//注意事项：用自定义类时要重写hashCode(),equals()方法
//eg:   Set<Student> set = new HashSet<>();  Student类要重写上述方法
        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }

}
