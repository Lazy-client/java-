package 容器.Collection集合;

import java.util.ArrayList;
import java.util.List;

/*
* 1.1集合概述
  在前面基础班我们已经学习过并使用过集合ArrayList<E> ,
* 那么集合到底是什么呢?·集合︰集合是java中提供的一种容器，可以用来存储多个数据。
集合和数组既然都是容器，它们有啥区别呢?
·数组的长度是固定的。集合的长度是可变的。
int[]arr = new int[10];
student[] arr = new Student[3];IArrayList<Student><String><lnteger>
·数组中存储的是同一类型的元素，可以存储基本数据类型值。集合存储的都是对象。
* 而且对象的类型可以不一致。在开发中一般当对象多的时候，使用集合进行存储。

* */
public class 集合 {
    public static void main(String[] args) {
        ArrayList<Integer> collection = new ArrayList<>(1);
        List<String> hello = List.of("Hello", "Monica", "MyBaby", "SeeYou");
         // hello.add("like");
        //使用List类的静态方法List.of(),返回一个固定长度的集合，不能调用add()
       //UnsupportedOperationException
        //当已知元素个数，可是有List.of()方法，一次性添加元素
        System.out.println(hello);
    }

}
