package String相关.StringOperate;
/*
*    String与获取相关的中常用方法
*    public int length();//返回字符串长度
*    public String concat(String str);拼接字符串得到新字符串
*    public char charAt(index);返回索引值处的单个字符
*    public int  indexOf(String str);
*
*
*
* */
public class StringGet {
    public static void main(String[] args) {
        String str1= "周思成";
        System.out.println(str1);
        System.out.println(str1.length());
        String str = "asdas".concat(str1);//不会改变原字符串
        System.out.println("asdas".concat(str1));
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.indexOf("as"));
    }

}
