package Static;

public class StaticField {
    public static void main(String[] args) {
        Student one = new Student("郭嘉",19);
        one.room = "101";
        Student two = new Student("黄帝",90);
        System.out.println("name:"+one.getName()+"  age:"+one.getAge()+"  id:"+one.getId()+" room:"+Student.room);
        System.out.println("name:"+two.getName()+"  age:"+two.getAge()+"  id:"+two.getId()+" room:"+Student.room);


    }
}
