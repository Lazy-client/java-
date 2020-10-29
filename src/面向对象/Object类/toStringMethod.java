package 面向对象.Object类;


/*
* String t1 ="内容";
* String t2 ="内容";
*
* t1 == t2
* 地址值比较
*
* t1.equals(t2)
* 内容的比较
* */
public class toStringMethod {
    public static void main(String[] args) {
        Son son = new Son("Hbase", 20);
        System.out.println(son);
        System.out.println(son.toString());//没有重写，打印地址值
        System.out.println("================");

        Person p = new Person("Max",18);
        System.out.println(p);
        System.out.println(p.toString());//默认打印地址值，重写后打印信息
    }
}
