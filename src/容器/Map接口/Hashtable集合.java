package 容器.Map接口;

import java.util.Hashtable;

public class Hashtable集合 {
    public static void main(String[] args) {
        //线程安全key，value都不允许为空
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("aaa",null);//NullPointerException
        hashtable.put(null,90);//NullPointerException
        hashtable.put(null,null);//NullPointerException
        //空指针异常
    }
}
