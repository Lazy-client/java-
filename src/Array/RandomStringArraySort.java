package Array;


import java.util.Arrays;

public class RandomStringArraySort {
    public static void main(String[] args) {
        String str = "abciopQQ";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (char aChar : chars) {
            System.out.print(aChar);
        }
        System.out.println();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}
