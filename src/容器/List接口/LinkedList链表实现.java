package 容器.List接口;

import java.util.LinkedList;
/*底层是链表实现类
* */
public class LinkedList链表实现 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.addFirst("what you are !!");
        linkedList.add("Monica");

//        linkedList.clear();

        if (!linkedList.isEmpty()){
            System.out.println(linkedList.getFirst());
            System.out.println(linkedList.getLast());

        }

    }
}
