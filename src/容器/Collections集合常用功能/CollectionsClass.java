package 容器.Collections集合常用功能;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
*
java.utils.collections
是集合工具类，用来对集合进行操作。部分方法如下:
public static <T> boolean addAll(Collection<T> c，T... elements) :
往集合中添加一些元素。

public static void shuffle(List<?> list)打乱顺序:打乱集合顺序。
public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

* public static <T> void sort(List<T> list , Comparator<? super T〉) :
将集合中元素按照指定规则排序。

*
* */
public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,23,4,100,10,90,8,-10);

        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);//默认升序

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2 - o1;
            }
        });

        System.out.println(list);
        method();
    }

    public static void method(){
        ArrayList<Person> list = new ArrayList<>();
        Person monica = new Person("Monica", 20);
        Person jack = new Person("Jack", 19);
        Person mary = new Person("Mary", 23);

        Collections.addAll(list,monica,jack,mary);
        System.out.println(list);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  -o1.getAge() + o2.getAge();
            }
        });
        System.out.println(list);





    }
}
