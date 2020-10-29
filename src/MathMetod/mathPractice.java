package MathMetod;

import java.util.ArrayList;

import static java.lang.Math.abs;
//[-10.8,5.9]找绝对值小于2.1或大于6
public class mathPractice {
    public static void main(String[] args) {
        double max = 5.9;
        double min = -10.8;
        ArrayList<Integer>  array = new ArrayList<>();
        for (int i = (int)min; i <= max ; i++) {
            if(abs(i)<2.1||abs(i)>6)
                array.add(i);
        }
        for (Integer integer : array) {
            System.out.print(integer+" ");
        }
        System.out.println();
        System.out.println(array.size());
//        System.out.println(array);


    }
}
