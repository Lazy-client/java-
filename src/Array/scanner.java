package Array;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       //  String str = scan.next();
        int a,b;
        //System.out.print("please input a number:");
        //a = scan.nextInt();
        //System.out.print("please input a number:");
        //b = scan.nextInt();
        System.out.print("please input a number:");
        methodScanner(new Scanner(System.in));
        Person person = new Person();
        person.name = "jdk +++";
        person.showName();
       // System.out.println(person.name);
        new Person().showName();
        System.out.println("================");
        System.out.println("please input a number :");
        int key = new Scanner(System.in).nextInt();
        System.out.print("what you input is:"+key);

    }
    public static void methodScanner(Scanner scanner)
    {
        System.out.println("what you input is:"+scanner.nextInt());
    }

}
