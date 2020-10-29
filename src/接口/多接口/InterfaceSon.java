package 接口.多接口;

public interface InterfaceSon extends InterfaceB,InterfaceA {

    @Override
    default void methodDefault() {

    }
}
