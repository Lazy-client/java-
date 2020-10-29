package 容器.List接口;

import java.util.ArrayList;
import java.util.Vector;

public class Vector集合 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("aaa");
        vector.addElement("234");
        vector.addAll(new ArrayList<>());

    }
}
