package Array;
/*
* java.util.Arrays 是与数组相关的工具类，提供了大量的静态方法
* public static String toString(数组)，将参数数组转化为[元素1，元素2.....元素n-1]
*
*
* */

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
            int[] arrray = {0,12,1,7};
//        Ja(arrray);
        String string = Arrays.toString(arrray);//转化为[0,12,1,7]
        System.out.println(string);
        Arrays.sort(arrray);//传递arrray的地址值，将array排好序

        for (int Array : arrray) {
            System.out.print(Array + " ");
        }//arrray.for  正序遍历
        System.out.println();
        for (int i = arrray.length - 1; i >= 0; i--) {
            System.out.print(arrray[i]+" ");
        }//arrray.forr  逆序遍历
    }


}
