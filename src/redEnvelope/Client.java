package redEnvelope;

public class Client {
    private  String name;
    private  int money;


    public Client(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public  void show(){
        System.out.println( this.name+"有"+this.money+"元");
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
