package 接口;
/*
* 任何版本java中都可以定义抽象方法
*
* public abstract 返回值类型 方法名称(参数列表);
* 注意事项:
* 1.接口中的抽象方法必须用public abstract关键字修饰
* 2.关键字可选择性省略
* */
public interface MyInterfaceAbstract {
    public static final int NUM = 10;
    public abstract void method1();
    public void method2();
    void method3();
    abstract void method4();
    //都是抽象类

    public  static void methodStatic(){
        System.out.println("hello,static");
    }

//    新添加的方法
//    public  abstract void method();
//     如果实现类没有重写该方法会报错

//    新添加默认方法，可用于接口升级
    public default void methodDefualt(){}


}
