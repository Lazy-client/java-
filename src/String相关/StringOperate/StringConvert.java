package String相关.StringOperate;
/*
* 字符串转换相关方法
*
* public char[] toCharArray();
* public byte[] toBytes();
* public String replace(charSequence oldString, charSequence newString )
*     charSequence可以接收String类型变量
* */
public class StringConvert {
    public static void main(String[] args) {
        char[] chars = "balabala".toCharArray();
        System.out.println(chars);
        System.out.println("我是你大爷，你大爷".replace("大爷","**"));
        for (char aChar : chars) {
            System.out.print(aChar);

        }
    }
}
