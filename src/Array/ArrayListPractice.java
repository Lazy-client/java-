package Array;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPractice {
    public static void main(String[] args){
        //ArrayList<String> list= new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            list1.add(new Random().nextInt(33) + 1);

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(list1.get(i)+" ");
        }


    }


}
