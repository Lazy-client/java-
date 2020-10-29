package String相关.StringBuilder;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("zsc");
        stringBuilder.append("aaa").append(2);
        //append()方法返回值是自身this
        System.out.println(stringBuilder);
    }
}
