package 接口.多接口;

public class InterfaceImple  implements InterfaceA,InterfaceB{

    @Override
    public void methodA() {

    }

    @Override
    public void methodDefault() {
        System.out.println("实现类覆盖重写A，B接口的默认方法");
    }//A,B接口都有该方法冲突。要覆盖重写

    @Override
    public void methodB() {

    }

    @Override
    public void method() {

    }//A，B都有该方法，但这是抽象方法不会产生冲突
}
