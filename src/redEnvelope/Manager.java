package redEnvelope;

import java.util.ArrayList;

public class Manager extends Client{
    public Manager(String name, int money) {
        super(name, money);
    }

    public Manager() {
    }

        public ArrayList<Integer> send(int totalSend,int count)
        {
            //需要集合来存红包
            ArrayList<Integer> RedEnvolope = new ArrayList<>();
            int leftMoney = super.getMoney();
            if (leftMoney < totalSend)
            {
                System.out.println("余额不足！");
                return RedEnvolope;
            }
            super.setMoney(leftMoney - totalSend);
            int avg = totalSend / count;
            int mod = totalSend % count;
            for (int i = 0; i < count - 1; i++) {
                RedEnvolope.add(avg);
            }

            RedEnvolope.add(avg + mod);

            return RedEnvolope;
        }
}
