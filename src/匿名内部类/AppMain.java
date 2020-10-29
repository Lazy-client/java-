package 匿名内部类;

/*
* 匿名内部类定义格式：
* 接口名称 对象名 = new 接口名称(){//覆盖重写接口的抽象方法};
* */
public class AppMain {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("Implement ");
            }
        };
        obj.method();
        String string;
    }
}
