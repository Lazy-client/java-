package String相关.StringOperate;
/*
*    public  String[] split(String regex);
*
*
* */

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
       String str = "i am lihua and you";
        String[] array = str.split(" ");
        for (String s : array) {
            System.out.println(s);
        }
        int  countUpper = 0,countLower = 0, other = 0,countNum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入字符串：");
        String input = scanner.next();

        System.out.println("input:"+input);
        char[] chars = input.toCharArray();

        for (char aChar : chars) {
            if(aChar>='A'&&aChar<='Z')
                countUpper++;
            else if(aChar>='a'&&aChar<='z')
                countLower++;

            else if(aChar>='0'&&aChar<='9')
                countNum++;
            else
                other++;

        }
        System.out.println("大写字母：" + countUpper);
        System.out.println("小写字母：" + countLower);
        System.out.println("数字字符：" + countNum);
        System.out.println("其他字符：" + other);


    }
}
