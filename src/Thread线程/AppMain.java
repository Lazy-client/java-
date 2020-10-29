package Thread线程;

public class AppMain {
    public static void main(String[] args) {
        ThreadSon thread = new ThreadSon();
        thread.setName("Monica");//给线程设置名称
        thread.start();

        ThreadSon aClass =
                new ThreadSon("hello Monica");//调用ThreadClass构造方法
        aClass.start();

        System.out.println(Thread.currentThread().getName() );
    }
}
