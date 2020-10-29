package 容器.Collection集合;

import java.util.ArrayList;
import java.util.Arrays;

/*boolean add(E e);      向集合中添加元素
boolean remove(E e );    删除集合中的某个元素
void clear( );           清空集合所有的元素
boolean contains(E e);    判断集合中是否包含某个元素
boolean isEmpty ( );     判断集合是否为空
int size();              获取集合的长度
object[]toArray();       将集合转成一个数组

* */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("Monica");
        collection.add("hello");
        collection.add("Salad");
        System.out.println(collection);
//        String value = String.valueOf(collection);
//        System.out.println(value);

//        collection.remove("Salad");
        System.out.println(collection);
         System.out.println(collection.size());

        Object[] array = collection.toArray();
        for (Object o : array) {
            System.out.println(o);
        }
        Arrays.sort(array);
        for (Object o : array) {
            System.out.println(o);
        }


    }
}
