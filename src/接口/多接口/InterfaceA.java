package 接口.多接口;

public interface InterfaceA {
    public abstract void methodA();
    public default void methodDefault(){
        System.out.println("A接口默认方法");
    }
    public void method();
}
