package 接口;


/*
  接口是引用数据类型
  生成关键字interface后，编译生成的字节文件仍是java -> class文件
* 定义接口格式:
  public interface 接口名称{
//接口内容
}
可以包含内容：
1.常量       //  public static final 常量名 = 常量值;
            //  定义时必须赋值  常量名所有字母大写，用下划线分隔 //JAVA_HOME,HADOOP_NAME
            //常量一旦赋值不可修改，关键字可选择性省略

2.抽象方法    //  public abstract 返回值类型 方法名(参数列表);

3.默认方法   //   public defualt  返回值类型 方法名(参数列表){// 方法体}
           //    用于接口升级，可覆盖重写
   接口使用步骤
  不能直接使用，必须用实现类来实现该接口（即继承该类的子类）
  格式：
 1. public calss 类名称 implements 接口名称{
  //...}
 2. 接口实现类必须重写接口的所有抽象方法
*3.创建实现类对象，使用接口
* */
public class 接口Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractImple imple = new MyInterfaceAbstractImple();
        imple.method1();
        MyInterfaceAbstract.methodStatic();
    }


}
