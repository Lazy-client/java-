package String相关.StringOperate;
/*
* public String substring(int beginIndex);//返回索引处直到末尾的字符串
* public String substring(int beginIndex,int endIndex);返回[begin，end）的子字符串
*
* 原字符串的值始终不变
* */
public class SubString {
    public static void main(String[] args) {
        String str = "asaaa".substring(0,3);
        System.out.println(str);
        System.out.println("asaaa".substring(1));
        str = "sadasd";//将“sadasd”的地址值赋给str
        str = "aaaaaa";//将"aaaaaa"的地址值赋给str
        //右边没发生改变只是str的地址值变了，字符串内容无法改变

    }
}
