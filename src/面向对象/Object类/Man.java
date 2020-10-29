package 面向对象.Object类;

public class Man extends Person {
    public String gender;

    public Man() {
    }

    public Man(String name, int age, String gender) {
        super(name, age);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public  void manMethod(){
        System.out.println("哈哈哈!!!");
    }

    @Override
    public boolean equals(Object obj) {
        Man man = (Man)obj;
        if (super.equals(obj)&&this.gender.equals(man.gender))
            return true;
        else return false;
    }



    @Override
    public String toString() {
        return super.toString()+"Man{" +
                "gender='" + gender + '\'' +
                '}';
    }

}
