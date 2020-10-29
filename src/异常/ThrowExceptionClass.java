package 异常;

import java.io.IOException;

public class ThrowExceptionClass {
    public static void main(String[] args) {
        try {
            readFile("c:hello.text");
//            System.out.println("后续代码");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Hello Monica ");


    }
    public static void readFile(String path) throws IOException {
        if (!path.endsWith(".txt")){
            System.out.println("文件读取后缀名异常");

        }
        else
            System.out.println(" No   Exception");

    }




    }

