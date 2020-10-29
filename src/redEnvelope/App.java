package redEnvelope;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager("爸爸", 1000);
        ArrayList<Integer> redEnvolope = manager.send(900, 5);
        manager.show();
        Member member1 = new Member("a",300);
        Member member2 = new Member("b", 500);
        member1.receive(redEnvolope);
        member2.receive(redEnvolope);
        member1.show();
        member2.show();

    }
}
