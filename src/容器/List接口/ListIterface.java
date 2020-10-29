package 容器.List接口;

import java.util.ArrayList;
import java.util.List;

/*
* java.util.List接口extends Collection接口list接口的特点:
1.有序的集合,存储元素和取出元素的顺序是一致的(存储123取出123)
2.有索引,包含了一些带索引的方法
3.允许存储重复的元素

* list接口中带索引的方法(特有)
- public void add(int index，E eLement):
将指定的元素，添加到该集合中的指定位置上。
- public E get( int index):返回集合中指定位置的元素。

* - public E remove(int index):
* 移除列表中指定位置的元素，返回的是被移除的元素。

* - public E set(int index,E element) :
用指定元素替换集合中指定位置的元素,返回值的更新前的元素。注意:
操作索引的时候,一定要防止索引越界异常
*/
public class ListIterface {
    public static void main(String[] args) {
        List<String> List = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List.add(0,"hello");
        List.add("Monica");
        System.out.println(List);
        String remove = List.remove(1);
        System.out.println(List);

        List.set(0,"Wow");
        System.out.println(List);

    }

}
