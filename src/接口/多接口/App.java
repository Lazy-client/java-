package 接口.多接口;

public class App {
    public static void main(String[] args) {
        Son son = new Son();
        son.methodDefault();
        InterfaceImple imple = new InterfaceImple();
        imple.methodDefault();
    }
}
