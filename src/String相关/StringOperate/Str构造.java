package String相关.StringOperate;

public class Str构造 {
    public static void main(String[] args) {
        String str1 = new String();
        byte[] byteArray = {1,2,3,4};
        String str2 = new String(byteArray);

        char[] charArray = {'a','a','v','m'};

        String str3 = new String(charArray);
        System.out.println(str1+str2+str3);


    }

}
