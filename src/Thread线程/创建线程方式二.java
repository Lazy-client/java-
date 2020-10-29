package Thread线程;
/*
* 创建多线程程序的第二种方式:
  实现Runnable接口java.Lang.Runnable
  Runnable接口应该由那些打算通过某一线程执行其实例的类来实现。
* 类必须定义一个称为run的无参数方法。
* java.Lang.Thread类的构造方法
Thread ( Runnable target)分配新的Thread 对象。
Thread (Runnable target,String name）分配新的Thread 对象。实现步骤:
1 .创建一个Runnable接口的实现类
2.在实现类中重写RunnabLe接口的run方法,设置线程任务
3.创建一个Runnable接口的实现类对象
4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
5.调用Thread类中的start方法,开启新的线程执行run方法

* */
public class 创建线程方式二 {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableImpl(),"Monica");
        thread.start();


        System.out.println(Thread.currentThread().getName());
        //多态，使用匿名内部类
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();

    }
}
