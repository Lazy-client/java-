package 面向对象.Object类;

import java.util.Objects;

public class equalMethod {
    public static void main(String[] args) {
        Person lily = new Person("Lily", 19);
        Person mary = new Person("Mary", 19);


        System.out.println(mary.equals(lily));
//       Boolean equals(Object object)方法默认比较的是地址值
//       隐藏了多态，左父右子，弊端无法访问子类特有方法,只能访问两者共有方法
//        解决方法向下转型

        Person man = new Man("Jack",18,"male");
        Man man1 =(Man) man;
       Man man2 = new Man("Jack",18,"male");
        System.out.println(man1.equals(man2));
        System.out.println(man1.toString());
        System.out.println("=============");


        String str1 = "abc";
        String str2 = "abc";
        //字符串常量池，str1,str2公用一个内存空间
        System.out.println(str1 == str2);  //true
//        str1,str2内容相等
        System.out.println(str1.equals(str2));//true

        str1 = null;
        Boolean b = Objects.equals(str1, str2);
        System.out.println(b);
    }
}
