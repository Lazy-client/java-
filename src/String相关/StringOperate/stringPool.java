package String相关.StringOperate;


/*
* 1. 在基本类型中，==是对值的比较
* 2. 在引用类型中，==是地址值的比较
* 3. 字符串常量池在堆中，Str=“  ”（只有直接写的在字符串常量池），new Str(new的不在)
* */
/*  public boolean equals(Object obj);参数可以是任何对象
    只有内容是字符串并且内容相同时，返回true，否则返回false
    1.任何对象都可用Object接收
    2.equals()具有对称性
            a.equals(b) = b.equals(a)
    3.常量和变量比较，推荐常量在前

    public boolean equalsIgnoreCase(String str);
    忽略大小写字符串内容比较


    */
public class stringPool {
    public static void main(String[] args) {
        String str1 = "abc";//在字符串常量池中
        String str2 = "abc";//常量池可重复利用，内容一样地址相同，将str1的地址赋给str2

        System.out.println(str1 == str2);// 对于引用类型 '=='比较的是地址值
        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str3);
        System.out.println(str3);
        System.out.println(str1.equals(str2));

    }

}
