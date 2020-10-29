package 包装类;
/*
* 装箱:把基本类型的数据,包装到包装类中(基本类型的数据->包装类)
构造方法:
Integer(int value）构造一个新分配的Integer对象，它表示指定的 int 值。
Integer(String s）构造一个新分配的Integer对象，它表示String 参数所指示的int值。
传递的字符串,必须是基本类型的字符串,否则会抛出异常“10e”正确“a”抛异常
静态方法:
static Integer value0f(int i）返回一个表示指定的 int值的Integer 实例。
static Integer valueOf(String s）返回保存指定的 string 的值的Integer对象。
拆箱:在包装类中取出基本类型的数据(包装类-基本类型的数据)
成员方法:
int intValue()以int类型返回该Integer的值。

* */
public class 装箱 {
    public static void main(String[] args) {
        Integer integer = new Integer("1");
        int i = integer.intValue();
        System.out.println(integer);
    }

}
