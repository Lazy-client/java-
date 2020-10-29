package 接口.多接口;

public interface InterfaceB {
    public default void methodDefault(){

        System.out.println("B接口默认方法");
    }
    public abstract void methodB();
    public void method();
}
