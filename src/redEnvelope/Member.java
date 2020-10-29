package redEnvelope;

import java.util.ArrayList;
import java.util.Random;

public class Member extends Client{
    public Member(String name, int money) {
        super(name, money);
    }

    public Member() {
    }
    public void receive(ArrayList<Integer> RedEnvolope){
        int index = new Random().nextInt(RedEnvolope.size());
        Integer remove = RedEnvolope.remove(index);
        super.setMoney(super.getMoney()+remove);

    }
}
