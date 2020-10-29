package 面向对象.继承;

import 面向对象.继承.Animal;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catMouse(){
        System.out.println("猫捉老鼠");
    }
}
