package Array;



import java.util.ArrayList;
import java.util.Random;

public class ArrayListget {


    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer>  bigList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            bigList.add( r.nextInt(100) + 1);
        }
        ArrayList<Integer> smallList =  new ArrayList<>();
        smallList = getSamllList(bigList);
        System.out.println("有" + smallList.size() + "个偶数");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.print(smallList.get(i)+" ");

        }
        System.out.println();
    }
        public static ArrayList<Integer> getSamllList(ArrayList<Integer> bigList){
           ArrayList<Integer> smallList = new ArrayList<>();
            for (int i = 0; i < bigList.size(); i++) {
                if(bigList.get(i) % 2== 0 )
                {
                    smallList.add(bigList.get(i));
                }

            }

            return   smallList;

        }



}
