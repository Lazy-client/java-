package 面向对象.继承;

import 面向对象.继承.Father;

/*
*   重写(Override)注意事项
*   子类方法名称与参数列表与父类一致，否则不是覆盖重写
*   子类方法权限要【大于等于】父类
*   public>protected>private>default
*   子类返回值【小于等于】父类
*
*
*
*
* */
public class Son extends Father {
    int num = 20;

    @Override
    public void print() {
        //super();   只有子类构造方法才能调用父类的构造方法
        int num = 30;
        System.out.println(num);           //访问局部变量
        System.out.println(this.num);     //访问本类变量
        super.print();                   //访问父类print()方法
//        System.out.println(super.num);//访问基类变量
    }
}
