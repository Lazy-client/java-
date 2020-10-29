package 面向对象.继承;

import 面向对象.继承.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃shit");
    }
    public void bark(){
        System.out.println("woof woof woof");
    }
}
