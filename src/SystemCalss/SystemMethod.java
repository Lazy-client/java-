package SystemCalss;

import java.util.Arrays;

public class SystemMethod {
    public static void main(String[] args) {
      method();
      methodCopy();
    }
    public static void method(){
        long start = System.currentTimeMillis();
        /*for (int i = 0; i < 9999; i++) {
            System.out.println(i+1);

        }*/
        long end = System.currentTimeMillis();
         //返回从原点到当前时刻毫秒值
        System.out.println(end - start+" " + "\nstart:"+start + "\nend:"+end);
    }
    public static void methodCopy(){
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {9,7,0,9,10,10};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        System.arraycopy(array1,0,array2,0,3);
        System.out.println(Arrays.toString(array2));


    }
}
