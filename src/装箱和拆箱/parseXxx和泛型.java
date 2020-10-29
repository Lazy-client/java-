package 装箱和拆箱;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class parseXxx和泛型 {
    public static void main(String[] args) throws ParseException {
        int i = Integer.parseInt("1");
        System.out.println(i);
        String s = String.valueOf(3);
        Integer integer = Integer.valueOf(1);
        int value = integer.intValue();

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add("java");
        list1.add("how high");
        list1.add("Monica");

        list2.add(123);
        list2.add(22);

        method(list1);
        method(list2);
    }

public static void method(ArrayList<?> arrayList){
//      ArrayList< ? >
//      ? 是泛型通配符
    for (int i = 0; i < arrayList.size(); i++) {
        System.out.println(arrayList.get(i));
    }
}
    
}
