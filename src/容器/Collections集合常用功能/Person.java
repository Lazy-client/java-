package 容器.Collections集合常用功能;

import java.util.Comparator;
//集合中使用自定义数据类型，重写compare()方法，实现Comparator<Persion>接口
public class Person implements Comparator<Person>{
    private String name;
    private  int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();//升序
    }


}
